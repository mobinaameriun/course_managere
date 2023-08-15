package com.manager.course.course_manager.dao;

import com.manager.course.course_manager.entity.Student;
import com.manager.course.course_manager.repository.StudentRepository;

import java.util.List;

public interface StudentDao {
    Student save(Student student);
    void delete(Long id);
    void update(Student student);
    Student load(Long id);
    Iterable<Student> loadAll();
}
