package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: SentinelApplication8041
 * @description:
 * @author: liusCoding
 * @create: 2020-06-11 12:38
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SentinelApplication8888 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication8888.class,args);
    }
}
