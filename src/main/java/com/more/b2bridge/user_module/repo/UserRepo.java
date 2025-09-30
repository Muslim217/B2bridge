package com.more.b2bridge.user_module.repo;

import com.more.b2bridge.user_module.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailOrUsernameOrPhone(String email, String username, String phone);
}
