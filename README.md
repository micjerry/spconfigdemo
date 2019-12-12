验证Spring Cloud的配置方案

1、正确配置git账户的url和密码，运行config-server-demo作为配置服务，配置信息存放在git上;

2、运行config-client-demo，去配置服务下载自己的配置，application name和profile设置一定要和git上一致，否则找不到配置。
   client运行成功后执行curl http://localhost:3302/message，可以查看到获取的配置信息
   env: home, username: prod, password: vlv
