package com.manager.course.course_manager.entity;
import com.manager.course.course_manager.base.Base;
import jakarta.validation.constraints.Size;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Student extends Base<Long> {
    @Column(nullable = false)
    @Size(max = 48)
    private  String firstName;
    private String lastName;
    @Column(nullable = false)
    private int nationalCode;
    @Size(max = 128)
    private String address;
    @Column(nullable = false)
    @ManyToMany
    private List<Course> courses;
    @ManyToOne
    private Department department;

}
