package com.example.tryspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }) // 排除自动配置数据源
//@SpringBootApplication包含了@EnableAutoConfiguration 能告诉Spring Boot根据你添加的jar依赖项 "猜测" 你想如何配置Spring。


/**
 * @author 文杰
 * @Date: 2024/2/15
 */

@SpringBootApplication()
@MapperScan("com.example.tryspringboot.dao") // 扫描的mapper
public class TrySpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(TrySpringBootApplication.class, args);
    }

}
// mvn spring-boot:run 直接运行
// mvn clean package 打包后运行
// E:\java_jdk\jdk17\bin\java.exe -jar D:\Project\JavaProject\TrySpringBoot\target\TrySpringBoot-0.0.1-SNAPSHOT.jar
//如果你查看 target 目录，你应该看到 TrySpringBoot-0.0.1-SNAPSHOT.jar。  如果你想看看这jar里面到底有什么东西，你可以使用 jar tvf。

//相当于flask的app.run()，需要在main函数里调用这个类的方法
//所以这其实是一个启动类，启动类里面的main函数是程序的入口，启动类里面的run函数是启动类的入口