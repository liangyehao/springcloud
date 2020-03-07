package com.liang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/7 14:31
 * @content
 */
@Configuration
public class Config {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
