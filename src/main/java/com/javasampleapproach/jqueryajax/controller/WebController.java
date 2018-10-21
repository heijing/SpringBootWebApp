package com.javasampleapproach.jqueryajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
    @GetMapping(value="/")
    public String root(){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }



    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}