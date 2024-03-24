package com.ufrn.imd.hellorestmvc.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String message(String inputMessage){
        return inputMessage == null ? "world" : inputMessage;
    }
}
