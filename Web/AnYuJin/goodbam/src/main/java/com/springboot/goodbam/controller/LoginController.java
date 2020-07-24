package com.springboot.goodbam.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class LoginController {

    @RequestMapping("/")
    public  String loginform() throws Exception {
        String page="memberData";

        return page;
    }




}
