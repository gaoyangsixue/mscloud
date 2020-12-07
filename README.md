# mscloud
开发分支:dev
初始版本全部文件上传  
包含项目:  
  1.普通消费者:cloud-consumer-order80  
  2.普通生成者:cloud-provider-payment8001,cloud-provider-payment8002  
  3.eureka注册中心cloud-eureka-server7001cloud-eureka-server7002(可作集群也可以单独配置)  
  4.consumer注册中心客户端:cloud-consumer-order80  
  5.zookeeper注册中心客户端:cloud-consumerzk-order80  
  6.带feign/openfeign消费者:cloud-consumer-feign-order-80  
  7.带hystrix消费者:cloud-consumer-feign-hystrix-order80  
  8.hystrix监控:cloud-consumer-hystrix-dashboard9001  
  9.gateway网关中心:cloud-gateway-gateway9527  
  10.config配置中心(带消息总线):cloud-config-center-3344,cloud-config-center-3355,cloud-config-center-3366  
  11.stream消息驱动  
    1)消息驱动生产者8801(已提交)
    2)消息驱动消费者8802(已提交)
    3)消息驱动消费者8803(已提交)
  12.待完成:sleuth分布式链路跟踪  
  13.待完成:Alibaba nacos服务注册和配置/sentinel熔断和限流/seata分布式事务配置  
  
