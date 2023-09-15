package com.manager.course.course_manager.service.impl;

import com.manager.course.course_manager.service.DepartmentDao;
import com.manager.course.course_manager.entity.Department;
import com.manager.course.course_manager.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements DepartmentDao {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void delete(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow();
        departmentRepository.delete(department);
    }

    @Override
    public void update(Department department) {
        delete(department.getId());
        departmentRepository.save(department);
    }

    @Override
    public Department load(Long id) {
        return departmentRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<Department> loadAll() {
        return departmentRepository.findAll();
    }
}
