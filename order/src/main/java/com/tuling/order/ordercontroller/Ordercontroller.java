package com.tuling.order.ordercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class Ordercontroller {
    @Autowired
    RestTemplate resttemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String mesg = resttemplate.getForObject("http://localhost:8011/strok/reduct",String.class);
        return "Hello Word"+mesg;
    }
}
