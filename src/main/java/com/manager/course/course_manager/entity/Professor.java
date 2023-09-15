package com.manager.course.course_manager.entity;

import com.manager.course.course_manager.base.Base;
import jakarta.validation.constraints.Size;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class Professor extends Base<Long>{
    @Column(nullable = false)
    @Size(max = 48)
    private String firstName;
    private String lastName;
    @Column(nullable = false)
    private int nationalCode;
    @OneToMany
    private List<Course> courses;
    @ManyToOne
    private Department department;
}
