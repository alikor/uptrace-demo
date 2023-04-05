package main.java.com.hcl.madu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private final RestTemplate restTemplate;

    @Autowired
	public HelloController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

    @GetMapping("/hello/{input}")
    public String echo(@PathVariable String input) {
        String output = this.restTemplate.getForObject("http://vm2:8080/echo/" + input, java.lang.String.class);
        return "From hello Server:" + output;
    }
}
