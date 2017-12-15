package com.example.demo.system.service.impl;

import com.example.demo.system.service.SystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "mainService")
public class SystemServiceImpl implements SystemService {
    private static final Logger log = LoggerFactory.getLogger(SystemServiceImpl.class);
    @Value("${server.port}")
    String port;
    @Override
    public String sayHi() {
        log.info("sayHi called");
        return "Hi,i am mainService from port:" +port;
    }
}
