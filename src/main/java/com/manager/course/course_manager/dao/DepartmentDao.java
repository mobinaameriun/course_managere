package com.manager.course.course_manager.dao;
import com.manager.course.course_manager.entity.Department;

public interface DepartmentDao {
    Department save(Department department);
    void delete(Long id);
    void update(Department department);
    Department load(Long id);
    Iterable<Department> loadAll();
}
