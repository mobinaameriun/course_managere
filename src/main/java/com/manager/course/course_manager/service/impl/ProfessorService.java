package com.manager.course.course_manager.service.impl;

import com.manager.course.course_manager.service.ProfessorDao;
import com.manager.course.course_manager.entity.Professor;
import com.manager.course.course_manager.repository.ProffessorRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService implements ProfessorDao {

    private final ProffessorRepository proffessorRepository;

    public ProfessorService(ProffessorRepository proffessorRepository) {
        this.proffessorRepository = proffessorRepository;
    }

    @Override
    public Professor save(Professor professor) {
        return proffessorRepository.save(professor);
    }

    @Override
    public void delete(Long id) {
       Professor professor= proffessorRepository.findById(id).orElseThrow();
       proffessorRepository.delete(professor);
    }

    @Override
    public void update(Professor professor) {
        delete(professor.getId());
        save(professor);
 }

    @Override
    public Professor load(Long id) {
        return proffessorRepository.findById(id).orElseThrow();
    }

    @Override
    public Iterable<Professor> loadAll() {
        return proffessorRepository.findAll();
    }
}
