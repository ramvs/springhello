package com.springapp.mvc.controller;

import com.springapp.mvc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krystian on 2015-10-13.
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/order/P1234/2")
    public String process(){
        orderService.processOrder("P1234",2);
        return "redirect:/products";
    }
}
