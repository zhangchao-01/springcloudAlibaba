package com.tuling.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class OrderApplication {
    //启动类
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }

    @Bean
    public RestTemplate resttemplate(RestTemplateBuilder builder){
        RestTemplate resttemplate =  builder.build();
        return  resttemplate;
    }
}
