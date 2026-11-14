package com.assignment.studentmanagement.service;

import com.assignment.studentmanagement.entity.Student;
import com.assignment.studentmanagement.exception.StudentNotFoundException;
import com.assignment.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student create(Student student) {
        student.setId(null);
        return studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    public Student update(Long id, Student updatedStudent) {
        Student existing = findById(id);
        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());
        existing.setCourse(updatedStudent.getCourse());
        existing.setAge(updatedStudent.getAge());
        return studentRepository.save(existing);
    }

    public void delete(Long id) {
        Student existing = findById(id);
        studentRepository.delete(existing);
    }

    @Transactional(readOnly = true)
    public List<Student> findByCourse(String course) {
        return studentRepository.findByCourseIgnoreCase(course);
    }
}
