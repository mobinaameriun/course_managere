package com.manager.course.course_manager.dao.impl;

import com.manager.course.course_manager.dao.CourseDao;
import com.manager.course.course_manager.entity.Course;
import com.manager.course.course_manager.entity.Student;
import com.manager.course.course_manager.repository.CourseRepository;

public class CourseDaoImpl implements CourseDao {
    private final CourseRepository courseRepository;

    public CourseDaoImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void delete(Long id) {
        Course course=courseRepository.findById(id).orElseThrow();
        courseRepository.delete(course);
    }

    @Override
    public void update(Course course) {
        delete(course.getId());
        courseRepository.save(course);
    }

    @Override
    public Course load(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<Course> loadAll() {
        return courseRepository.findAll();
    }
}
