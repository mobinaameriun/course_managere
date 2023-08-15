package com.manager.course.course_manager.dao;

import com.manager.course.course_manager.base.repository.BaseRepo;
import com.manager.course.course_manager.entity.Course;
import com.manager.course.course_manager.entity.Department;
import com.manager.course.course_manager.repository.CourseRepository;

public interface CourseDao {
    Course save(Course course);
    void delete(Long id);
    void update(Course course);
    Course load(Long id);
    Iterable<Course> loadAll();
}
