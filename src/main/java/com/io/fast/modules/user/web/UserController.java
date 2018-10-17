package com.io.fast.modules.user.web;

import com.io.fast.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 10:51
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Lazy
    private UserService userService;

    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }

}
