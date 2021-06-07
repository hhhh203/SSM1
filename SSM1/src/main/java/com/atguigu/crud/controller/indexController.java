package com.atguigu.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class indexController {
    @RequestMapping({"/","/index"})
    public String index(Map map){
        return "redirect:/login";
    }
    @RequestMapping("/login_submit")
    public String login_submit(String username, String password, HttpSession session , Map map){
        if("ZW".equals(username) && "ZW".equals(password)){
            session.setAttribute("user",username);
            return "redirect:/index";
        }else{
            map.put("msg","用户名或密码错误");
            return "redirect:/login";
        }
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }
}
