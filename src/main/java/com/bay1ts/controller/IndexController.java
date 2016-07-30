package com.bay1ts.controller;

import com.bay1ts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenu on 2016/7/29.
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
