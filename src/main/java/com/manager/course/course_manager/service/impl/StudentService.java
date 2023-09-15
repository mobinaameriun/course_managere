package com.manager.course.course_manager.service.impl;

import com.manager.course.course_manager.service.StudentDao;
import com.manager.course.course_manager.entity.Student;
import com.manager.course.course_manager.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentDao {
   private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        Student student=studentRepository.findById(id).orElseThrow();
        studentRepository.delete(student);
    }

    @Override
    public void update(Student student) {
        delete(student.getId());
        studentRepository.save(student);
}

    @Override
    public Student load(Long id) {

        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<Student> loadAll() {
       return studentRepository.findAll();
    }
}
