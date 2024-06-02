package br.com.alunoonlineaula3.Api.controller;


import br.com.alunoonlineaula3.Api.model.Professor;
import br.com.alunoonlineaula3.Api.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Professor professor) {
        professorService.create(professor);
    }
}
