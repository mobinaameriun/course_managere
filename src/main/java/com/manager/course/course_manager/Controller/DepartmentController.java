package com.manager.course.course_manager.Controller;

import com.manager.course.course_manager.entity.Department;
import com.manager.course.course_manager.service.impl.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/validatorSaveMethod}")
    public void saveDepartment(@PathVariable Department department) {
        departmentService.save(department);
    }

    @GetMapping("/validatorDeleteMethod}")
    public void deletDepartment(Long id) {
        departmentService.delete(id);
    }

    @GetMapping("/validatorUpdateMethod")
    public void updateDepartment(Department department) {
        departmentService.update(department);
    }

    @GetMapping("/validatorLoadMethod}")
    public Department loadDepartment(@PathVariable Long id) {
        return departmentService.load(id);
    }

    @GetMapping("/validatorLoadAllMethod")
    public Iterable<Department> loadAll(){
        return departmentService.loadAll();
    }
}
