package com.gradezilla.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 9/28/2015.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String home(){
        return "login";
    }
}
