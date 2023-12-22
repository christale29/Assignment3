package com.example.studentapp.domain.repository;

import com.example.studentapp.domain.domain.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicRepository extends JpaRepository<AcademicUnit,Integer> {
}
