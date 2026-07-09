package com.utkarsh.library_management_system.service.impl;

import com.utkarsh.library_management_system.dto.request.BookCreateRequest;
import com.utkarsh.library_management_system.dto.response.BookResponse;
import com.utkarsh.library_management_system.entity.Book;
import com.utkarsh.library_management_system.mapper.BookMapper;
import com.utkarsh.library_management_system.repository.BookRepository;
import com.utkarsh.library_management_system.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;
    private BookMapper bookMapper;
    @Override
    public BookResponse addBook(BookCreateRequest request) {
        Book book = Book.builder()
                .name(request.title())
                .author(request.author())
                .isbn(request.isbn())
                .totalCopies(request.totalCopies())
                .availableCopies(request.totalCopies())
                .build();
        Book saved = bookRepository.save(book);
        return bookMapper.toResponse(saved);
    }

    @Override
    public BookResponse getById(Long id) {
        return null;
    }

    @Override
    public Page<BookResponse> searchBook(String query, Pageable pageable) {
        return null;
    }

    @Override
    public BookResponse addCopies(Long id, int count) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
