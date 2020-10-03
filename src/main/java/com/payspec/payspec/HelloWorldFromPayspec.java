package com.payspec.payspec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldFromPayspec {

    @RequestMapping("/greet")
    public  String helloGreetiing(){
        return "Hello from Payspec";
    }
}
