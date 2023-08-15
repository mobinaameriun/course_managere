package com.manager.course.course_manager.dao.impl;

import com.manager.course.course_manager.dao.StudentDao;
import com.manager.course.course_manager.entity.Student;
import com.manager.course.course_manager.repository.StudentRepository;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
   private final StudentRepository studentRepository;

    public StudentDaoImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        Student student=studentRepository.findById(id).orElseThrow();
        studentRepository.delete(student);
    }

    @Override
    public void update(Student student) {
        delete(student.getId());
        studentRepository.save(student);
}

    @Override
    public Student load(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<Student> loadAll() {
       return studentRepository.findAll();
    }
}
