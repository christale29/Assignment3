package com.example.studentapp.domain.repository;

import com.example.studentapp.domain.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
