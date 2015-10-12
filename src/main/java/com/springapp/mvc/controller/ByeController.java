package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Krystian on 2015-10-07.
 */
@Controller
@RequestMapping("/bye")
public class ByeController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(@RequestParam(value="name", required=false, defaultValue="World") String name,ModelMap model) {
        model.addAttribute("message", "Bye world! "+name);
        return "bye";
    }
    @RequestMapping("noelo")
    public String siema(){
        return "hello";
    }

}
