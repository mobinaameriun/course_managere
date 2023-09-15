package com.manager.course.course_manager.Controller;

import com.manager.course.course_manager.entity.Professor;
import com.manager.course.course_manager.service.impl.ProfessorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/validatorSaveMethod}")
    public void saveProfessor(@PathVariable Professor professor){
        professorService.save(professor);
    }

    @GetMapping("/validatorDeleteMethod}")
    public void deleteProfessor(Long id){
        professorService.delete(id);
    }

    @GetMapping("/validatorUpdateMethod}")
    public void updateProfessor(Professor professor){
        professorService.update(professor);
    }

    @GetMapping("/validatorLoadMethod}")
    public Professor loadProfessor(Long id){
        return professorService.load(id);
    }

    @GetMapping("/validatorLoadAllMethod")
    public Iterable<Professor> professors(){
        return professorService.loadAll();
    }
}
