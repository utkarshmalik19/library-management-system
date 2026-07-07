package com.utkarsh.library_management_system.dto.response;

public record BookResponse(
        Long id,
        String title,
        String author,
        String isbn,
        String publisher,
        int totalCopies,
        int availableCopies
) {
}
