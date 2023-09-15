package com.manager.course.course_manager.Controller;

import com.manager.course.course_manager.entity.Student;
import com.manager.course.course_manager.service.impl.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/validatorSaveMethod}")
    public void saveStudent(@PathVariable Student student) {
        studentService.save(student);
    }

    @GetMapping("/validatorDeleteMethod}")
    public void deleteStudent(Long id) {
        studentService.delete(id);
    }

    @PostMapping("/validatorUpdateMethod}")
    public void updateStudent(@PathVariable Student student) {
        studentService.update(student);
    }

    @GetMapping("/validatorLoadMethod}")
    public Student loadStudent(Long id) {
        return studentService.load(id);
    }

    @GetMapping("/validatorLoadAllMethod")
    public Iterable<Student> loadAll() {
        return studentService.loadAll();
    }
}
