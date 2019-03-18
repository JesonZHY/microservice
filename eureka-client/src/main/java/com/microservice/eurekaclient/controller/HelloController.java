package com.microservice.eurekaclient.controller;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @GetMapping("/calc")
    public String calc(Integer a, Integer b) {
        return "a + b =" + (a + b);
    }
}
