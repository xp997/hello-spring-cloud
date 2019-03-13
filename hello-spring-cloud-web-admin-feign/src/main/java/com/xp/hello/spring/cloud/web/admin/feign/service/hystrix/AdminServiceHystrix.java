package com.xp.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.xp.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String hello(String message) {
        return "Bad Request "+message;
    }
}
