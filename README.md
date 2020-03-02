# probe-netty-rpc-demo

probe-netty-rpc-demo: probe-netty-rpc-framework的调用示例

> probe-netty-rpc-demo-api

```
传输对象：dto的定义

实体对象：entity(和数据库中的表对应)

api: 接口定义

vo: 接口返回对象定义
```

> probe-natty-rpc-demo-client 对外提供api调用
```
客户端应用配置实例: application.yml
spring:
  application:
    name: probe-services #服务名称
  register-center:
    hosts:  #注册中心列表,内网ip
      - localhost:2181
      - localhost:2182
      - localhost:2183
    base-path: /probe-services #zookeeper注册中心的basePath
    register-center-type: ZOOKEEPER #注册中心类型支持ZOOKEEPER、CONSUL
  netty-server:
    select-strategy: ROUNDROBIN #服务发现时,选择服务提供者ip和port的策略
```
> probe-netty-rpc-demo-service

api接口的实现，具体的业务处理

应用配置实例: application.yml
```
spring:
  application:
    name: probe-services #服务名称
  register-center:
    hosts:  #注册中心列表,内网ip
      - localhost:2181
      - localhost:2182
      - localhost:2183
    base-path: /probe-services #zookeeper注册中心的basePath
    register-center-type: ZOOKEEPER #注册中心类型支持ZOOKEEPER、CONSUL
  netty-server:
    ip-addr: 127.0.0.1  #netty服务所在的服务器的内网ip
    port: 12181 #netty服务端口
```