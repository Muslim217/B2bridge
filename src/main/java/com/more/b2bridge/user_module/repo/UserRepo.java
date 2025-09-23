package com.more.b2bridge.user_module.repo;

import com.more.b2bridge.user_module.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
