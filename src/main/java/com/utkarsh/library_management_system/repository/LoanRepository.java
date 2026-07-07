package com.utkarsh.library_management_system.repository;

import com.utkarsh.library_management_system.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
