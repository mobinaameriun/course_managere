package com.manager.course.course_manager.Controller;

import com.manager.course.course_manager.entity.Course;
import com.manager.course.course_manager.service.impl.CoursseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Course")

public class CourseController {
    private final CoursseService coursseService;

    @Autowired
    public CourseController(CoursseService coursseService) {
        this.coursseService = coursseService;
    }

    @GetMapping("/validatorSaveMethod}")
    public void saveCourse(@PathVariable Course course) {
        coursseService.save(course);
    }

    @GetMapping("/validatorDeleteMethod}")
    public void deleteCourse(Long id) {
        coursseService.delete(id);
    }

    @GetMapping("/validatorUpdateMethod}")
    public void updateCourse(@PathVariable Course course) {
        coursseService.update(course);
    }

    @GetMapping("/validatorLoadMethod}")
    public Course loadCourse(Long id) {
        return coursseService.load(id);
    }

    @GetMapping("/validatorLoadAllMethod")
    public Iterable<Course> loadAll(){
        return coursseService.loadAll();
    }
}
