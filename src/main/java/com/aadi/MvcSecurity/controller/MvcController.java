package com.aadi.MvcSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v1")
public class MvcController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
