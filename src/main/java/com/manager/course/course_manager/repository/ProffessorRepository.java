package com.manager.course.course_manager.repository;

import com.manager.course.course_manager.base.repository.BaseRepo;
import com.manager.course.course_manager.entity.Professor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProffessorRepository extends BaseRepo<Professor,Long> {
}
