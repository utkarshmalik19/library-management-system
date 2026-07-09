package com.utkarsh.library_management_system.mapper;

import com.utkarsh.library_management_system.dto.response.BookResponse;
import com.utkarsh.library_management_system.dto.response.BookSummary;
import com.utkarsh.library_management_system.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookResponse toResponse(Book book) {
        return new BookResponse(
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getIsbn(),
                book.getPublisher(),
                book.getTotalCopies(),
                book.getAvailableCopies()
        );
    }

    public BookSummary toSummary(Book book) {
        return new BookSummary(book.getId(), book.getName(), book.getIsbn());
    }
}
