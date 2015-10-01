package com.gradezilla.web;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 9/28/2015.
 */
@Controller
public class HomeController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping("/welcome")
    public String getHomePage(){
        return "welcome";
    }

    // Error page
    @RequestMapping("/error")
    public String error(HttpServletRequest request, Model model) {
        model.addAttribute("errorCode", request.getAttribute("javax.servlet.error.status_code"));
        Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
        String errorMessage = null;
        if (throwable != null) {
            errorMessage = throwable.getMessage();
        }
        model.addAttribute("errorMessage", errorMessage);
        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
