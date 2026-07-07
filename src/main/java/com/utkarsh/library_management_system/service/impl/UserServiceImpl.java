package com.utkarsh.library_management_system.service.impl;

import com.utkarsh.library_management_system.dto.request.UserRegisterRequest;
import com.utkarsh.library_management_system.dto.response.UserReponse;
import com.utkarsh.library_management_system.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public UserReponse register(UserRegisterRequest request) {
        return null;
    }

    @Override
    public UserReponse getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserReponse> getAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(Long id) {

    }
}
