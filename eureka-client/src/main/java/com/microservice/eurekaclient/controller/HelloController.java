package com.microservice.eurekaclient.controller;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
