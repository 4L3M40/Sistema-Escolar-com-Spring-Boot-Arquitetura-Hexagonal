package com.senai.escola.adapters.output;

import com.senai.escola.application.port.output.EstudanteOutPut;
import com.senai.escola.domain.Estudante;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class EstudanteRepository implements EstudanteOutPut {

    private final EstudanteJpaRepository estudanteJpaRepository;

    public EstudanteRepository(
            EstudanteJpaRepository estudanteJpaRepository) {
        this.estudanteJpaRepository = estudanteJpaRepository;
    }

    @Override
    public Estudante salvar(Estudante estudante) {
        return estudanteJpaRepository.save(estudante);
    }

    @Override
    public List<Estudante> buscarTodos() {
        return estudanteJpaRepository.findAll();
    }

    @Override
    public Optional<Estudante> buscarPorId(Long id) {
        return estudanteJpaRepository.findById(id);
    }

    @Override
    public void deletar(Long id) {
        estudanteJpaRepository.deleteById(id);
    }
}