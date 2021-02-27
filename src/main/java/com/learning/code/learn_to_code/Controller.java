package com.learning.code.learn_to_code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/docker")
public class Controller {

    @GetMapping("/hello")
    public String returnHello(){
        return "This confirms that I am running on docker";
    }
}
