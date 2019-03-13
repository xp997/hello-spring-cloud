package com.xp.hello.spring.cloud.web.admin.ribbon.controller;


import com.xp.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value="{message}",method = RequestMethod.GET)
    public String helloEureka(@PathVariable("message") String message){
        return adminService.hello("xp哈哈哈"+message);
    }
}
