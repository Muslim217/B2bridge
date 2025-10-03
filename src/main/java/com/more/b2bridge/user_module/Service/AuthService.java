package com.more.b2bridge.user_module.Service;


import com.more.b2bridge.user_module.dto.UserLogDto;
import com.more.b2bridge.user_module.model.User;
import com.more.b2bridge.user_module.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private UserRepo userRepo;
    private UserService userService;

    public AuthService(UserRepo userRepo, UserService userService) {
        this.userRepo = userRepo;
        this.userService = userService;
    }

    public boolean login(UserLogDto dto) {
        var userOpt = userRepo.findByEmailOrUsernameOrPhone(
                dto.getIdentifier(), dto.getIdentifier(), dto.getIdentifier());

        if (userOpt.isEmpty()) {
            return false;
        }

        User user = userOpt.get();
        String hash = userService.hashPassword(dto.getPassword());

        return user.getPasswordHash().equals(hash);
    }

}
