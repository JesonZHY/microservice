package com.microservice.eurekafeign.controller;

import com.microservice.eurekafeign.service.ComputerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerCompute {

    @Autowired
    ComputerClient computerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computerClient.add(10, 20);
    }
}
