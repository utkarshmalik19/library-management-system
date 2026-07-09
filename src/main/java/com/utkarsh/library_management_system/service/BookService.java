package com.utkarsh.library_management_system.service;

import com.utkarsh.library_management_system.dto.request.BookCreateRequest;
import com.utkarsh.library_management_system.dto.response.BookResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
BookResponse addBook(BookCreateRequest request);
BookResponse getById(Long id);
Page<BookResponse> searchBook(String query, Pageable pageable);
BookResponse addCopies(Long id, int count);
void delete(Long id);
}
