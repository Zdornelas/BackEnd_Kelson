package br.com.alunoonlineaula3.Api.service;

import br.com.alunoonlineaula3.Api.model.Aluno;
import br.com.alunoonlineaula3.Api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;

    public void create(Aluno aluno){
        alunoRepository.save(aluno);
    }
    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }
    public Optional<Aluno> FindById(Long id){
        return alunoRepository.findById(id);
    }
    public void update(Long id, Aluno aluno){
        Optional<Aluno> alunoFromDb = findById(id);

        if (alunoFromDb.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aluno não encontrado");
        }
        Aluno alunoUpdate = alunoFromDb.get();
        alunoUpdate.setNome(aluno.getNome());
        alunoUpdate.setEmail(aluno.getEmail());

        alunoRepository.save(alunoUpdate);
    }

    private Optional<Aluno> findById(Long id) {
        return Optional.empty();
    }

    public void deleteByiD(Long id){
        alunoRepository.deleteById(id);
    }

}
