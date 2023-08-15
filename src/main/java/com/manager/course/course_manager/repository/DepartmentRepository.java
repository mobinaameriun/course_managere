package com.manager.course.course_manager.repository;
import com.manager.course.course_manager.base.repository.BaseRepo;
import com.manager.course.course_manager.entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends BaseRepo<Department,Long> {
}
