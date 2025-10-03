package com.more.b2bridge.user_module.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserRegDto {
    private String username;
    private String email;
    private String password;

    private String firstName;
    private String lastName;
    private String phone;
    private LocalDateTime registrationDate;
}
