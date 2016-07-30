package com.bay1ts.controller;

import com.bay1ts.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenu on 2016/7/29.
 */
@RestController
@RequestMapping("api")
public class APIController {
    @Autowired
    private UserService userService;
    @RequestMapping("test")
    public String test(){
        Gson gson=new Gson();
        return gson.toJson(userService.getCurrentUser());
    }

}
