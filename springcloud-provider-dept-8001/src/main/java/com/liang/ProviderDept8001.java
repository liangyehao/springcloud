package com.liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/7 11:41
 * @content
 */
@SpringBootApplication
@MapperScan("com.liang.mapper")
@EnableEurekaClient
public class ProviderDept8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001.class,args);
    }
}
