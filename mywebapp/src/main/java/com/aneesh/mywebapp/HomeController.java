package com.aneesh.mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {


    @RequestMapping("home") 
    public ModelAndView home(Alien alien){

       
        ModelAndView mv = new ModelAndView();

        mv.addObject("obj", alien);


        mv.setViewName("home");

        return mv;
    }
    
}
