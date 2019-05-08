# springdemos

博客地址： https://blog.csdn.net/h356363

Eureka-->服务注册与发现

ribbon-->负载均衡
负载均衡：把请求分散处理。

集群： 服务器集群就是指将很多服务器集中起来一起
进行同一种服务
,在客户端看来就像是只有一个服务器。

通过nginx可以实现集群。
集群是方式，负载均衡是目的。


架构：如何实现高可用？

横向：集群,所有服务器都提供一样的服务。

纵向：分布式。每台服务器可以提供不同的功能。




nginx--反向代理


jar命名启动项目,linux后台运行
nohup java -jar XXX.jar &

nohup java -jar EurekaServer-1.0-SNAPSHOT.jar &

打开EurekaServer地址
http://localhost:8080/

打开consumer测试的地址
http://localhost:9001/info

在consumer的controller里面，通过RestTemplate调用了EurekaClient的controller并且拿到返回值
 return this.restTemplate.getForEntity("http://SERVER-PROVIDER/info", String.class).getBody();
 
 
 测试RibbonConsumer：
     http://localhost:9002/user/1
 http://localhost:9002/user/
 
 http://localhost:9002/user/add
 
 http://localhost:9002/user/update
 
 http://localhost:9002/user/delete/1
 
 
 通过 <type>pom</type> 和 <scope>import</scope>实现了maven的多继承。 这种用法只能在dependencyManagement里面
 
 <dependencyManagement>
         <dependencies>
             <dependency>
                 <groupId>org.springframework.cloud</groupId>
                 <artifactId>spring-cloud-dependencies</artifactId>
                 <version>Edgware.SR3</version>
                 <type>pom</type>
                 <scope>import</scope>
             </dependency>
         </dependencies>
     </dependencyManagement>

