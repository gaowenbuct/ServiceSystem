package com.example.demo.system.controller;

import com.example.demo.system.service.OrderService;
import com.example.demo.system.service.SystemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SystemController {
    @Resource
    SystemService systemService;
    @Resource
    OrderService orderService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){//@RequestParam String name
        return systemService.sayHi();
    }
    @RequestMapping(value = "/hi-order",method = RequestMethod.GET)
    public String sayHiOrder(){
        return orderService.sayHiOrder();
    }
}
