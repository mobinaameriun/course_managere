package com.manager.course.course_manager.dao;
import com.manager.course.course_manager.base.repository.BaseRepo;
import com.manager.course.course_manager.entity.Department;
import com.manager.course.course_manager.entity.Professor;

public interface ProfessorDao {
    Professor save(Professor professor);
    void delete(Long id);
    void update(Professor professor);
    Department load(Long id);
    Iterable<Professor> loadAll();
}
