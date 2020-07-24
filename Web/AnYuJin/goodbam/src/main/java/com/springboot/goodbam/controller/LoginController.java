package com.springboot.goodbam.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class LoginController {

    @RequestMapping("/")
    public  String mainPage() throws Exception {
        String page="index";

        return page;
    }

    @RequestMapping("/login")
    public  String loginPage() throws Exception {
        String page="login";

        return page;
    }
    @RequestMapping("/logOut")
    public  String logOut() throws Exception {
        String page="index";

        return page;
    }

    @RequestMapping("/dataTable")
    public  String dataTable() throws Exception {
        String page="dataTable";

        return page;
    }


    @RequestMapping("/memberList")
    public  String memberList() throws Exception {
        String page="memberList";

        return page;
    }


    @RequestMapping("/memberData")
    public  String loginform() throws Exception {
        String page="memberData";

        return page;
    }





}
