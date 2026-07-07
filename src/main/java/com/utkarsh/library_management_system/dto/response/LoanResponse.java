package com.utkarsh.library_management_system.dto.response;

import java.time.LocalDate;

public record LoanResponse (
    Long id,
    BookSummary book,
    Long userId,
    LocalDate checkOutDate,
    LocalDate dueDate,
    LocalDate returnDate,
    String status
){}
