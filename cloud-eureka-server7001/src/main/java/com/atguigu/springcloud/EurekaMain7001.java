package com.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eurekaserver端服务注册中心,实现服务的注册和发现
 * 目的:实现服务治理,管理服务与服务之间的关系,可以实现服务调用,负载均衡,容错等
 */
@EnableEurekaServer//开启eureka服务
@SpringBootApplication
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
