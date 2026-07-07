package com.utkarsh.library_management_system.service;

import com.utkarsh.library_management_system.dto.request.UserRegisterRequest;
import com.utkarsh.library_management_system.dto.response.UserReponse;

import java.util.List;

public interface UserService {
    UserReponse register(UserRegisterRequest request);
    UserReponse getUserById(Long id);
    List<UserReponse> getAllUsers();
    void deleteUser(Long id);
}
