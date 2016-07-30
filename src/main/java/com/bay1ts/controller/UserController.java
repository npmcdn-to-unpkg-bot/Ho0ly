package com.bay1ts.controller;

import com.bay1ts.domain.User;
import com.bay1ts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenu on 2016/7/5.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("user",userService.getCurrentUser());
        System.out.println("aaa--------------");
        return "user/index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/dispatcher")
    public String dispatcher(){
        if (userService.getCurrentUser().getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))){
            return "redirect:/admin/";
        }else {
            return "redirect:/user/";
        }
    }

}
