package com.springapp.mvc.controller;

import com.springapp.mvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

/**
 * Created by Krystian on 2015-10-13.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public String list(Model model){
        model.addAttribute("customers",customerService.getAllCustomers());
        return "customers";
    }
}
