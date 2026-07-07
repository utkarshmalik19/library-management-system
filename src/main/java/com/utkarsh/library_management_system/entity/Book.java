package com.utkarsh.library_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private String publisher;
    private String isbn;
    private int availableCopies;
    private int totalCopies;


    public boolean hasAvailableCopy(){
        return availableCopies>0;
    }
    public void decrementAvailableCopies(){
        if (availableCopies<=0){
            throw new IllegalStateException("No available copies to check out");
        }
        availableCopies--;
    }
    public void incrementAvailableCopies(){
        if (availableCopies >= totalCopies){
            throw new IllegalStateException("Available copies cannot be greater than total copies");
        }
        availableCopies--;
    }
}
