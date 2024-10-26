package com.senai.escola.adapters.input;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Tag(name = "Estudantes", description = "API para gerenciar estudantes")

public class EstudanteSwagger {

    @Operation(summary = "Cria um novo estudante")
        public void criarEstudante() { }

    @Operation(summary = "Busca todos os estudantes")
        public void buscarTodosEstudantes() { }

    @Operation(summary = "Busca um estudante por ID")
        public void buscarEstudantePorId() { }

    @Operation(summary = "Deleta um estudante")
        public void deletarEstudante() { }
        }
