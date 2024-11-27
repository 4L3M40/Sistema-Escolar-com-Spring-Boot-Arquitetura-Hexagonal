# Sistema Escolar - Arquitetura Hexagonal

## Descrição do Projeto
Este projeto é um sistema escolar simples desenvolvido em **Java** utilizando **Spring Boot** e implementa a **Arquitetura Hexagonal (Ports and Adapters)**. 
Ele é responsável por gerenciar estudantes, com possibilidade de expansão para novos módulos como professores e cursos. O foco principal é a separação de responsabilidades e o desacoplamento da lógica de negócios 
de frameworks e tecnologias externas.

---

## Arquitetura
O sistema segue a **Arquitetura Hexagonal**, garantindo modularidade e flexibilidade:
- **Domínio**: Contém as entidades e a lógica de negócios (ex.: `Pessoa.java` e `Estudante.java`).
- **Aplicação (Ports e Services)**: Define os casos de uso e interfaces para entrada e saída de dados (ex.: `EstudanteUseCase.java` e `EstudanteService.java`).
- **Adaptadores**:
  - **Entrada**: Inclui controladores REST e integração com o Swagger (ex.: `EstudanteController.java`).
  - **Saída**: Gerencia a persistência de dados com o banco utilizando Spring Data JPA (ex.: `EstudanteRepository.java`).

---

## Principais Funcionalidades
- **CRUD de Estudantes**:
  - Criar um estudante.
  - Buscar todos os estudantes.
  - Buscar estudante por ID.
  - Deletar estudante por ID.
- **Documentação Automática da API**:
  - Integração com o Swagger via Springdoc OpenAPI.

---

## Dependências Utilizadas
As principais dependências do projeto são:
- **Spring Web**: Para criação de APIs RESTful.
- **Spring Data JPA**: Para integração com o banco de dados.
- **MySQL Driver**: Para conexão com o banco MySQL.
- **Springdoc OpenAPI**: Para documentação automática da API.

---

## Endpoints Principais
- `POST /api/estudantes` - Cria um novo estudante.
- `GET /api/estudantes` - Retorna todos os estudantes.
- `GET /api/estudantes/{id}` - Retorna um estudante pelo ID.
- `DELETE /api/estudantes/{id}` - Deleta um estudante pelo ID.

---

## Como Executar o Projeto
1. Configure o banco de dados no arquivo `application.properties` localizado em `src/main/resources`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/primeira_api
   spring.datasource.username=SEU_USUARIO
   spring.datasource.password=SUA_SENHA
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

---

    Observações
O sistema foi desenvolvido seguindo boas práticas de programação e organização de código. A Arquitetura Hexagonal facilita a manutenção e a evolução do projeto, 
permitindo a troca ou adição de tecnologias e frameworks sem impactar diretamente na lógica de negócios.
