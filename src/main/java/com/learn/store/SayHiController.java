package com.learn.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class SayHiController {

    @GetMapping("/hi")
    public String greet(){
        return "Hi, World";
    }
}
