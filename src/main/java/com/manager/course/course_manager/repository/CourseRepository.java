package com.manager.course.course_manager.repository;
import com.manager.course.course_manager.base.repository.BaseRepo;
import com.manager.course.course_manager.entity.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends BaseRepo<Course,Long> {
}
