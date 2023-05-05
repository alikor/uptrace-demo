// implement EchoController here
package main.java.com.hcl.madu.echo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    private Logger logger = LoggerFactory.getLogger(EchoController.class);

    @GetMapping("/echo/{input}")
    public String echo(@PathVariable String input) {
        logger.info("From echo Server");
        return "From Echo Server:" + input;
    }
}
