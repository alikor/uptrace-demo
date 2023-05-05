package com.hcl.madu.hello;

import org.springframework.web.client.RestTemplate;


@org.springframework.context.annotation.Configuration
public class AppConfig {

    @org.springframework.context.annotation.Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}