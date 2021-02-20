package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommentResult;

public class CustomerBlockHandler {

    public static CommentResult handlerException(BlockException exception)
    {
        return new CommentResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommentResult handlerException2(BlockException exception)
    {
        return new CommentResult(4444,"按客戶自定义,global handlerException----2");
    }
}
