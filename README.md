# springcloud
spring cloud 项目实战入门

## 服务注册
Eureka

## 服务提供者
service-hi

## 服务消费

RestTemplate（RestTemplate是Spring提供的用于访问Rest服务的客户端）+Ribbon
Ribbon:通过在客户端中配置ribbonServerList来设置服务端列表去"轮询访问"以达到均衡负载的作用。

Feign
Feign是Netflix开发的声明式、模块化的HTTP客户端。Feign可帮助我们更好更快的便捷、优雅地调用HTTP API
只需要通过创建接口并用注解来配置它既可完成对Web服务接口的绑定。

## 熔断管理
Hystrix

