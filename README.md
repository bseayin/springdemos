# springdemos

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

