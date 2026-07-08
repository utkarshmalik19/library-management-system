package com.utkarsh.library_management_system.service.impl;

import com.utkarsh.library_management_system.dto.request.UserRegisterRequest;
import com.utkarsh.library_management_system.dto.response.UserResponse;
import com.utkarsh.library_management_system.entity.User;
import com.utkarsh.library_management_system.exception.ResourceNotFoundException;
import com.utkarsh.library_management_system.mapper.UserMapper;
import com.utkarsh.library_management_system.repository.UserRepository;
import com.utkarsh.library_management_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;
    @Override
    public UserResponse register(UserRegisterRequest request) {
        return null;
    }

    @Override
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", id));
        return userMapper.toResponse(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(Long id) {

    }
}
