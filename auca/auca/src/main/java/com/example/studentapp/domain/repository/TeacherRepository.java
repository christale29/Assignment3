package com.example.studentapp.domain.repository;

import com.example.studentapp.domain.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
