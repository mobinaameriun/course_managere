package com.manager.course.course_manager.service;

import com.manager.course.course_manager.entity.Student;

public interface StudentDao {
    Student save(Student student);
    void delete(Long id);
    void update(Student student);
    Student load(Long id);
    Iterable<Student> loadAll();
}
