package com.utkarsh.library_management_system.dto.response;

public record BookSummary(
        Long id,
        String title,
        String isbn
) {}