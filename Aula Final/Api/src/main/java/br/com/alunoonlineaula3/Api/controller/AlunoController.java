package br.com.alunoonlineaula3.Api.controller;

import br.com.alunoonlineaula3.Api.model.Aluno;
import br.com.alunoonlineaula3.Api.repository.AlunoRepository;
import br.com.alunoonlineaula3.Api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Aluno aluno) {
        alunoService.create(aluno);

    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> findAll(){
        return alunoService.findAll();

    }

    public Optional<Aluno>findById(Long id) {
        return alunoRepository.findById(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Aluno> findByID(@PathVariable Long id){
        return alunoRepository.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Aluno aluno, @PathVariable long id) {
        alunoService.update(id, aluno);
    }
    @DeleteMapping("/{i}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByID(@PathVariable Long id) {
        alunoService.deleteByiD(id);
    }
}
