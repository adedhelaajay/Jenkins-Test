package com.jenkins.spring;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/greet")
    public String sayHi(){
        return "Greetings!";
    }
}
