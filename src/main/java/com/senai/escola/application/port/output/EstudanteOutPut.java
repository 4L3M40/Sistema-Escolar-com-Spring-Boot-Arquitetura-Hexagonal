package com.senai.escola.application.port.output;

import com.senai.escola.domain.Estudante;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface EstudanteOutPut {
    Estudante salvar(Estudante estudante);
    List<Estudante> buscarTodos();
    Optional<Estudante> buscarPorId(Long id);
    void deletar(Long id);
}