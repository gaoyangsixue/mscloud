package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
/**
 *  hystrix:降级,熔断,限流
 *  默认超时时间为1000ms
 *  如果直接将处理方法写在业务类中或者每个方法对应一个处理方法,则高度耦合
 *  解决办法: 使用PaymentFallbackService类实现service接口,在接口中配置@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
 *  目的:面向接口编程,
 *
 *  解耦
 */
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}