package com.utkarsh.library_management_system.repository;

import com.utkarsh.library_management_system.entity.Fine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FineRepository extends JpaRepository<Fine,Long> {
}
