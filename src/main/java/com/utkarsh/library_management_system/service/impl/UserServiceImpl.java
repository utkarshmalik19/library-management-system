package com.utkarsh.library_management_system.service.impl;

import com.utkarsh.library_management_system.dto.request.UserRegisterRequest;
import com.utkarsh.library_management_system.dto.response.UserResponse;
import com.utkarsh.library_management_system.entity.User;
import com.utkarsh.library_management_system.entity.enums.Role;
import com.utkarsh.library_management_system.exception.ResourceNotFoundException;
import com.utkarsh.library_management_system.mapper.UserMapper;
import com.utkarsh.library_management_system.repository.UserRepository;
import com.utkarsh.library_management_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public UserResponse register(UserRegisterRequest request) {
        User user = new User();
        user.setName(request.name());
        user.setEmail(request.email());
        user.setPassword(request.password());
        //Only temporary, fix this later and assign in service maybe
        user.setRole(Role.USER);
        return userMapper.toResponse(userRepository.save(user));
    }

    @Override
    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", id));
        return userMapper.toResponse(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(userMapper::toResponse).collect(Collectors.toList());

    }

    @Override
    public void deleteUser(Long id) {

    }
}
