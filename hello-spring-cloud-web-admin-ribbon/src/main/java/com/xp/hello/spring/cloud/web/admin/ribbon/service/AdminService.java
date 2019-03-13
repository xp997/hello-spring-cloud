package com.xp.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hello(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/"+message,String.class);
    }

    public String hiError(String message){
        return "Bad Request "+message;
    }

}
