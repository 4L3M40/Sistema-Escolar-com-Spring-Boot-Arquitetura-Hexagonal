package com.senai.escola.adapters.input;

import com.senai.escola.application.port.input.EstudanteUseCase;
import com.senai.escola.domain.Estudante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/estudantes")
public class EstudanteController {

    private final EstudanteUseCase estudanteUseCase;
    public EstudanteController(EstudanteUseCase estudanteUseCase) {
        this.estudanteUseCase = estudanteUseCase;
    }
    @PostMapping
    public ResponseEntity<Estudante> criarEstudante(
            @RequestBody Estudante estudante) {
        return new
                ResponseEntity<>(estudanteUseCase.criarEstudante(estudante),
                HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Estudante>> buscarTodosEstudantes() {
        return new
                ResponseEntity<>(estudanteUseCase.buscarTodosEstudantes(),
                HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Estudante>
    buscarEstudantePorId(@PathVariable Long id) {
        return new
                ResponseEntity<>(estudanteUseCase.buscarEstudantePorId(id),
                HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEstudante(@PathVariable Long id) {
        estudanteUseCase.deletarEstudante(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

