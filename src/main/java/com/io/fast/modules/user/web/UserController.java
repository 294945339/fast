package com.io.fast.modules.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: dj
 * @Date: 2018\10\15 0015 10:51
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping
    public String getUsers() {
        return "Hello Spring Security";
    }

}
