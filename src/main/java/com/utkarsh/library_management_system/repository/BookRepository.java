package com.utkarsh.library_management_system.repository;

import com.utkarsh.library_management_system.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
