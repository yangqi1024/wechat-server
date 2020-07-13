package com.itpiggy.controller;

import com.itpiggy.pojo.User;
import com.itpiggy.utils.JSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @RequestMapping("/user/getUser")
    public JSONResult getUser(){
        User user = new User();
        user.setName("itpiggy");
        user.setAge(18);
        user.setBirthDay(new Date());
        return JSONResult.ok(user);
    }
}
