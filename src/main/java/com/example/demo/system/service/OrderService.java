package com.example.demo.system.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "service-order",fallback = OrderServiceHystrix.class)
public interface OrderService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiOrder();//@RequestParam(value = "name") String name
}
