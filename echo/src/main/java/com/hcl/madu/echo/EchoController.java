// implement EchoController here
package main.java.com.hcl.madu.echo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo/{input}")
    public String echo(@PathVariable String input) {
        return "From Echo Server:" + input;
    }
}
