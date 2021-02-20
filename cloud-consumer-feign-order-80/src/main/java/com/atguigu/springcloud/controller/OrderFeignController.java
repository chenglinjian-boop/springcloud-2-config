package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentFeignService;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.entities.CommentResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: OrderFeignController
 * @description:
 * @author: l
 * @create: 2020-06-05 14:37
 */

@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderFeignController {

    private final PaymentFeignService paymentFeignService;

    public OrderFeignController(PaymentFeignService paymentFeignService) {
        this.paymentFeignService = paymentFeignService;
    }

    @GetMapping("/payment/get/{id}")
    public CommentResult<Payment> getPaymentById(@PathVariable("id") Long id ){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //OpenFeign客户端一般默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
