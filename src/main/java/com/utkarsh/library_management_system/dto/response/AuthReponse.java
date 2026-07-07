package com.utkarsh.library_management_system.dto.response;

public record AuthReponse(
        String token,
        String tokenType,
        Long memberId,
        String role
) {
}
