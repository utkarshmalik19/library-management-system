package com.utkarsh.library_management_system.service;

import com.utkarsh.library_management_system.dto.request.UserRegisterRequest;
import com.utkarsh.library_management_system.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse register(UserRegisterRequest request);
    UserResponse getUserById(Long id);
    List<UserResponse> getAllUsers();
    void deleteUser(Long id);
}
