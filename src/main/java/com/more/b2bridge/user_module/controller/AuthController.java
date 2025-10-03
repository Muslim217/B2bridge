package com.more.b2bridge.user_module.controller;

import com.more.b2bridge.user_module.Service.AuthService;
import com.more.b2bridge.user_module.dto.UserLogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLogDto userLogDto) {
        boolean result = authService.login(userLogDto);

        return result ? "Вход успешен!" : "Неверный логин или пароль!";
    }
}
