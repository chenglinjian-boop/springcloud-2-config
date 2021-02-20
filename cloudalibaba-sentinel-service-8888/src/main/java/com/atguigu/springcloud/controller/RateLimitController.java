package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.handler.CustomerBlockHandler;
import com.atguigu.springcloud.entities.CommentResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @className: RateLimitController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-11 13:52
 */

@RestController
public class RateLimitController
{
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommentResult byResource()
    {
        return new CommentResult(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }
    public CommentResult handleException(BlockException exception)
    {
        return new CommentResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommentResult byUrl()
    {
        //Executors.newFixedThreadPool(100);
        //new ThreadPoolExecutor(100,100,60,);

        return new CommentResult(200,"按url限流测试OK",new Payment(2020L,"serial002"));
    }


    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommentResult customerBlockHandler()
    {
        return new CommentResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }
}