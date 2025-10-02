package com.more.b2bridge.user_module.model;

import com.more.b2bridge.user_module.enumeration.Role;
import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDateTime;

@Setter
@Getter
@Table(name= "Customer")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String email;
    private String passwordHash;
    private Role role;
    private String firstName;
    private String lastName;
    private int phone;
    private LocalDateTime registrationDate;

    private boolean isActive;
}
