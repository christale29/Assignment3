package com.example.studentapp.domain.repository;

import com.example.studentapp.domain.domain.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semester,Integer> {
}
