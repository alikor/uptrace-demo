package main.java.com.hcl.madu.hello;

import org.springframework.boot.Configuration;
import org.springframework.boot.Bean;
import org.springframework.web.client.RestTemplate;
import io.opentracing.Tracer;
import io.opentracing.contrib.zipkin.ZipkinTracer;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public io.opentracing.Tracer tracer() {
        return new ZipkinTracer();
    }
}