package com.utkarsh.library_management_system.repository;

import com.utkarsh.library_management_system.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
