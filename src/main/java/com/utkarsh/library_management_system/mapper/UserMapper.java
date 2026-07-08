package com.utkarsh.library_management_system.mapper;

import com.utkarsh.library_management_system.dto.response.UserResponse;
import com.utkarsh.library_management_system.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserResponse toResponse(User user){
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole().name()
        );
    }
}
