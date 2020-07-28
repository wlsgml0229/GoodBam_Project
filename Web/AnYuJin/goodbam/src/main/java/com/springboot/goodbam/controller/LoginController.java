package com.springboot.goodbam.controller;



import com.springboot.goodbam.svc.UserService;
import com.springboot.goodbam.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class LoginController {

    @Autowired
    UserService userService;
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
    public  String memberList(Model model) throws Exception {
        List<UserVO> list = userService.userList();
        model.addAttribute("list", list);
        return "memberList";
    }


    @RequestMapping("/memberData")
    public  String loginform() throws Exception {
        String page="memberData";

        return page;
    }





}
