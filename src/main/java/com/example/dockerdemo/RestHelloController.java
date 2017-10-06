package com.example.dockerdemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequestMapping("/hello")
public class RestHelloController {

    @RequestMapping(method=RequestMethod.GET)
    public String hello() {
        return "hellospringmvc";
    }
}
