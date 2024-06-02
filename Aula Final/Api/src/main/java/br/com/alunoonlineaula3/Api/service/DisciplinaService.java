package br.com.alunoonlineaula3.Api.service;

import br.com.alunoonlineaula3.Api.model.Disciplina;
import br.com.alunoonlineaula3.Api.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public void create(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> findAll(){
        return disciplinaRepository.findAll();

    }
    public Optional<Disciplina> findById(long id){
        return disciplinaRepository.findByiD(id);

    }
    public void update(Long id,Disciplina disciplina){
        Optional<Disciplina> disciplinaFromDb = findById(id);

        if(disciplinaFromDb.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Disciplina inexistente");
        }

        Disciplina disciplinaToUpdate = disciplinaFromDb.get();
        disciplinaToUpdate.setNome(disciplina.getNome());
        disciplinaRepository.save(disciplinaToUpdate);
    }

    public void delete(Disciplina disciplina){
        disciplinaRepository.deleteById(id);
    }


    public void deleteById(Long id) {
    }
}