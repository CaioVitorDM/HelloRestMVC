package com.ufrn.imd.hellorestmvc.Controller;

import com.ufrn.imd.hellorestmvc.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @GetMapping("/hello")
    public String hello(
            @RequestParam(value="name", required=false) String name
    ){
        return String.format("Hello, " + service.message(name));
    }
}
