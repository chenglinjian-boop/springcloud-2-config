package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: StreamMQApplication8803
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 13:59
 */

@SpringBootApplication
@EnableEurekaClient
public class StreamMQApplication8804 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQApplication8804.class,args);
    }
}
