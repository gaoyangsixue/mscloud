package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  微服务提供者支付module模块,服务提供者
 */
@EnableDiscoveryClient
@EnableEurekaClient//开启eureka功能
@SpringBootApplication
public class Cloudproviderpayment_8001_APP {
    public static void main(String[] args) {
        SpringApplication.run(Cloudproviderpayment_8001_APP.class,args);
    }


}
