package com.manager.course.course_manager.service;
import com.manager.course.course_manager.entity.Professor;

public interface ProfessorDao {
    Professor save(Professor professor);
    void delete(Long id);
    void update(Professor professor);
    Professor load(Long id);
    Iterable<Professor> loadAll();
}
