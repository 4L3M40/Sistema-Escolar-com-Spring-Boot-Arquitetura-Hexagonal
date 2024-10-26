package com.senai.escola.adapters.output;

import com.senai.escola.domain.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteJpaRepository extends
        JpaRepository<Estudante, Long> {
}