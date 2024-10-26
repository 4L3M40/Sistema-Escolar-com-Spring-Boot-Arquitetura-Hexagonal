package com.senai.escola.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.senai.escola.application.port.input.EstudanteUseCase;
import com.senai.escola.application.port.output.EstudanteOutPut;
import com.senai.escola.domain.Estudante;

@Service
public class EstudanteService implements EstudanteUseCase {

    private final EstudanteOutPut estudanteOutPut;

    @Autowired
    public EstudanteService(EstudanteOutPut estudanteOutPut) {
        this.estudanteOutPut = estudanteOutPut;
    }

    @Override
    public Estudante criarEstudante(Estudante estudante) {
        return estudanteOutPut.salvar(estudante);
    }

    @Override
    public List<Estudante> buscarTodosEstudantes() {
        return estudanteOutPut.buscarTodos();
    }

    @Override
    public Estudante buscarEstudantePorId(Long id) {
        return estudanteOutPut.buscarPorId(id).orElseThrow(
                () -> new RuntimeException("Estudante não encontrado!"));
    }

    @Override
    public void deletarEstudante(Long id) {
        estudanteOutPut.deletar(id);
    }
}
