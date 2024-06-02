package br.com.alunoonlineaula3.Api.repository;

import br.com.alunoonlineaula3.Api.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
