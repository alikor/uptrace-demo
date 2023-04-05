
package main.java.com.hcl.madu.hello;

import org.springframework.boot.Configuration;
import org.springframework.boot.Bean;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {


    @Bean
    public RestTemplate restTemplate() {
        // sleuth wil automatically add interceptors
        return new RestTemplate();
    }
}