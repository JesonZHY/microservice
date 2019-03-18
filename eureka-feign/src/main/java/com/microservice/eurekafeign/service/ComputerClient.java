package com.microservice.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("computer-server")
public interface ComputerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/calc")
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
