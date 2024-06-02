package br.com.alunoonlineaula3.Api.service;

import br.com.alunoonlineaula3.Api.model.Professor;
import br.com.alunoonlineaula3.Api.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public void create(Professor professor) {
        professorRepository.save(professor);
    }
}
