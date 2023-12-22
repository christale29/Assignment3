package com.example.studentapp.domain.repository;

import com.example.studentapp.domain.domain.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDefinitionRepo extends JpaRepository<CourseDefinition,Integer> {
}
