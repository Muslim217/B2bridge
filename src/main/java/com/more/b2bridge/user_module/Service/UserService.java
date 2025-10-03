package com.more.b2bridge.user_module.Service;

import com.more.b2bridge.user_module.dto.UserRegDto;
import com.more.b2bridge.user_module.model.User;
import com.more.b2bridge.user_module.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User registration(UserRegDto dto) {
        Optional<User> existingUser = userRepo.findByEmail(dto.getEmail());

        if (existingUser.isPresent()) {
            throw new RuntimeException("Пользователь с таким email уже существует!");
        }

        User user = new User();

        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPasswordHash(hashPassword(dto.getPassword()));
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setPhone(dto.getPhone());

        return userRepo.save(user);
    }


    public String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
