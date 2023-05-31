// implement EchoController here
package com.hcl.madu.echo;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    private Logger logger = LogManager.getLogger(EchoController.class);

    @GetMapping("/echo/{input}")
    public String echo(@PathVariable String input) {
        logger.info("YYY From echo Server");
        return "From Echo Server:" + input;
    }
}
