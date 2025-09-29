package com.more.b2bridge.user_module.controller;


import com.more.b2bridge.user_module.Service.UserService;
import com.more.b2bridge.user_module.dto.UserRegDto;
import com.more.b2bridge.user_module.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/reg")
    public String registrasion(@RequestBody UserRegDto userRegDto) {
        User user = new User();

        user.setUsername(userRegDto.getUsername());
        user.setEmail(user.getEmail());
        user.setPasswordHash(userService.hashPassword(userRegDto.getPassword()));

        return "запрос будет обработан позже...";
    }
}
