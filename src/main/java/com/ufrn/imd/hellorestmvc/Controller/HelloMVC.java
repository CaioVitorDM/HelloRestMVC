package com.ufrn.imd.hellorestmvc.Controller;

import com.ufrn.imd.hellorestmvc.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloMVC {
    @Autowired
    private HelloService service;

    @GetMapping("/hellomvc")
    public String hello(
            @RequestParam(name="name", required = false) String name, Model model
    )
    {
        model.addAttribute("name", service.message(name));
        return "hello";
    }
}
