package br.com.alunoonlineaula3.Api.repository;

import br.com.alunoonlineaula3.Api.model.Disciplina;
import jakarta.persistence.metamodel.SingularAttribute;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    Optional<Disciplina> findByiD(long id);

    void deleteById(SingularAttribute<AbstractPersistable, Serializable> id);
}
