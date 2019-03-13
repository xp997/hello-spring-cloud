package com.xp.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.server.RequestPath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value="{message}",method = RequestMethod.GET)
    public String hello(@PathVariable("message")String message){
        return "your port is :"+port+" your message is :"+message;
    }
}
