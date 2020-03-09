package com.liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/8 21:21
 * @content
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp7003.class,args);
    }
}
