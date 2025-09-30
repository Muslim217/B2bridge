package com.more.b2bridge.user_module.controller;


import com.more.b2bridge.user_module.Service.UserService;
import com.more.b2bridge.user_module.dto.UserLogDto;
import com.more.b2bridge.user_module.dto.UserRegDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/reg")
    public String registrasion(@RequestBody UserRegDto userRegDto) {
        userService.registration(userRegDto);
        return "Пользователь успешно добавлен";
    }
}
