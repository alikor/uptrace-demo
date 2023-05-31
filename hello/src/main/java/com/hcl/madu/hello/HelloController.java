package com.hcl.madu.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private final RestTemplate restTemplate;
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
	public HelloController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

    @GetMapping("/hello/{input}")
    public String echo(@PathVariable String input) {
        String output = this.restTemplate.getForObject("http://vm2:8080/echo/" + input, java.lang.String.class);
        logger.info("YYY From hello Server");
        return "From hello Server:" + output;
    }
}
