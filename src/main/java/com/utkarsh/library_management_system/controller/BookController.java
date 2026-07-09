package com.utkarsh.library_management_system.controller;

import com.utkarsh.library_management_system.dto.request.BookCreateRequest;
import com.utkarsh.library_management_system.dto.response.BookResponse;
import com.utkarsh.library_management_system.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
private BookService bookService;
    @PostMapping("/add")
    public ResponseEntity<BookResponse> addBook(@RequestBody BookCreateRequest request){
        BookResponse response = bookService.addBook(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getById(id));
    }
}
