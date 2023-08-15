package com.manager.course.course_manager.entity;
import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;
import com.manager.course.course_manager.base.Base;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data

public class Department extends Base<Long> {
    @Column(unique = true,nullable = false)
    @Size(min = 5,max=48)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String name;
    @Column(nullable = false)
    @OneToOne (mappedBy = "id")
    private Professor directorOfTheFacultyDepartment;
    @OneToMany
    private List<Professor> teachers;
    @OneToMany
    private List<Student> students;
    @Column(nullable = false)
    @OneToMany
    private List<Course> courses;
}
