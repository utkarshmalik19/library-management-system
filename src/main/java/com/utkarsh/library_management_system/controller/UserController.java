package com.utkarsh.library_management_system.controller;

import com.utkarsh.library_management_system.dto.request.UserRegisterRequest;
import com.utkarsh.library_management_system.dto.response.UserResponse;
import com.utkarsh.library_management_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }
    @PostMapping("/register")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRegisterRequest user){
      return ResponseEntity.ok(userService.register(user));
    }
    @GetMapping("/all")
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
