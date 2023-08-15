package com.manager.course.course_manager.entity;
import com.manager.course.course_manager.base.Base;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Course extends Base<Long> {
    @Column(unique = true,length = 64,nullable = false)
    private String title;
    @Column(nullable = false)
    private Integer unit;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},mappedBy = "courses")
    @JoinTable(name = "course_student",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> studentList;

}
