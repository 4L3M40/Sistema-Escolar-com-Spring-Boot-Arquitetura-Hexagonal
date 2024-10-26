package com.senai.escola.application.port.input;

import com.senai.escola.domain.Estudante;
import java.util.List;

public interface EstudanteUseCase {
    Estudante criarEstudante(Estudante estudante);
    List<Estudante> buscarTodosEstudantes();
    Estudante buscarEstudantePorId(Long id);
    void deletarEstudante(Long id);
}
