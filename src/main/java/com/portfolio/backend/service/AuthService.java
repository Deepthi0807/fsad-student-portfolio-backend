package com.portfolio.backend.service;

import com.portfolio.backend.dto.LoginRequest;
import com.portfolio.backend.dto.LoginResponse;
import com.portfolio.backend.dto.UserInfo;
import com.portfolio.backend.model.User;
import com.portfolio.backend.repository.UserRepository;
import org.springframework.stereotype.Service;
 
import java.util.Base64;
import java.util.Optional;
 
@Service
public class AuthService {
    private final UserRepository userRepository;
    
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
    public LoginResponse login(LoginRequest request) {
        Optional<User> optUser = userRepository.findByUsername(request.getUsername());
 
        if (optUser.isEmpty()) {
            throw new RuntimeException("Invalid username or password");
        }
 
        User user = optUser.get();
 
        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid username or password");
        }
 
        // Token = Base64("userId:role") — decoded by controllers
        String token = Base64.getEncoder()
                .encodeToString((user.getId() + ":" + user.getRole()).getBytes());
 
        UserInfo userInfo = new UserInfo(
                user.getId(),
                user.getName(),
                user.getRole(),
                user.getStudentId(),
                user.getEmail()
        );
 
        return new LoginResponse(token, userInfo);
    }
}
