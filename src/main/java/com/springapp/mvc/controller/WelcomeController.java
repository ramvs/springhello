package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krystian on 2015-10-10.
 */
@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String welcome(Model model){
        model.addAttribute("message","no napewno");
        return "hello";
    }
}
