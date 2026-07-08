package com.utkarsh.library_management_system.dto.response;

public record UserResponse(
        Long id,
        String name,
        String email,
        String role
) {
}
