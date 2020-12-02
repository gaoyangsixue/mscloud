package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * RestTemplate提供了多种便捷访问http服务的方法,是一种简单便捷的访问restful服务模板类,是spring提供的
     * 用于访问rest服务的客户端模板工具集
     * @return
     */
    @LoadBalanced   //实现本地的负载均衡，赋予RestTemplate负载均衡的能力
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
 
 
