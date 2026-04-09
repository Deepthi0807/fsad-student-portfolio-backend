package com.portfolio.backend.controller;
 
import com.portfolio.backend.dto.LoginRequest;
import com.portfolio.backend.dto.LoginResponse;
import com.portfolio.backend.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.util.Map;
 
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private final AuthService authService;
	 
    public AuthController(AuthService authService) {
        this.authService = authService;
    }
 
    // POST /api/auth/login
    // Called by Login.jsx → authAPI.login({ username, password })
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        try {
            LoginResponse response = authService.login(request);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.status(401)
                    .body(Map.of("message", e.getMessage()));
        }
    }
}
