package br.com.alunoonlineaula3.Api.repository;

import br.com.alunoonlineaula3.Api.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
