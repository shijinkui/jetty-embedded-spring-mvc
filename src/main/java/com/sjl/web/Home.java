package com.sjl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView m = new ModelAndView();
        m.setViewName("aa/index");
        return m;
    }

    @RequestMapping("/aaa")
    public ModelAndView aaa() {
        ModelAndView m = new ModelAndView();
        m.setViewName("aaa");
        return m;
    }

    @RequestMapping("/abc")
    @ResponseBody
    public String abc() {
        return "=======";
    }

}
