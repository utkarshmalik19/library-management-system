package com.utkarsh.library_management_system.service;

import com.utkarsh.library_management_system.dto.response.LoanResponse;
import com.utkarsh.library_management_system.entity.Book;

import java.util.List;

public interface LoanService {
    LoanResponse checkoutBook(Long loanId, Long userId);
    LoanResponse returnBook(Long loanId);
    List<LoanResponse> getActiveLoansForUser(Long userId);

}
