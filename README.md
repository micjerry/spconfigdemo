验证Spring Cloud的配置方案

1、正确配置git账户的url和密码，运行config-server-demo作为配置服务，配置信息存放在git上;

2、运行config-client-demo，去配置服务下载自己的配置，application name和profile设置一定要和git上一致，否则找不到配置。
   client运行成功后执行curl http://localhost:3302/message，可以查看到获取的配置信息
   
   
   env: home, username: prod, password: vlv
   
   
3、增加配置热更新支持，修改点包括：
   (1) pom引入actuator依赖
   (2) bootstrap.yml使能refresh endpoint
   (3) Controller、配置类增加@RefreshScope注解
   (4) 通过http://{ip_address}:{port}/actuator/refresh去触发配置重新下载
   
   验证：修改git配置信息
   执行curl http://localhost:3302/message，可以查看仍是老的配置信息
   执行curl -X POST http://localhost:3302/actuator/refresh 触发配置更新
   再次执行curl http://localhost:3302/message，获取到新配置
 
