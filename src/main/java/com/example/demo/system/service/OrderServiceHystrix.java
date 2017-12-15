package com.example.demo.system.service;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceHystrix implements OrderService {
    @Override
    public String sayHiOrder() {
        return "Sorry,orderService is down!";
    }
}
