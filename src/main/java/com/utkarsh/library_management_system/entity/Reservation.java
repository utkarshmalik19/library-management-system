package com.utkarsh.library_management_system.entity;

import com.utkarsh.library_management_system.entity.enums.ReservationStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Book book;
    private User user;
    private LocalDate reservationDate;
    private ReservationStatus status;
}
