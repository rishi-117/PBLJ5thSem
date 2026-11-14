package com.assignment.studentmanagement.repository;

import com.assignment.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByCourseIgnoreCase(String course);
}
