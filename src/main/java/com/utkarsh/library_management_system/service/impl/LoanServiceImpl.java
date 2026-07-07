package com.utkarsh.library_management_system.service.impl;

import com.utkarsh.library_management_system.dto.response.LoanResponse;
import com.utkarsh.library_management_system.repository.BookRepository;
import com.utkarsh.library_management_system.repository.LoanRepository;
import com.utkarsh.library_management_system.repository.UserRepository;
import com.utkarsh.library_management_system.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final BookRepository bookRepository;
    private final LoanRepository loanRepository;
    private final UserRepository userRepository;
    @Override
    public LoanResponse checkoutBook(Long loanId, Long userId) {
        return null;
    }

    @Override
    public LoanResponse returnBook(Long loanId) {
        return null;
    }

    @Override
    public List<LoanResponse> getActiveLoansForUser(Long userId) {
        return List.of();
    }
}
