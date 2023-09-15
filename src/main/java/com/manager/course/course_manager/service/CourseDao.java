package com.manager.course.course_manager.service;

import com.manager.course.course_manager.entity.Course;

public interface CourseDao {
    Course save(Course course);
    void delete(Long id);
    void update(Course course);
    Course load(Long id);
    Iterable<Course> loadAll();
}
