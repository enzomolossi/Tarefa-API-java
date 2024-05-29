# Tarefa-API-java

#Enzo Molossi e João Binotto
https://app.swaggerhub.com/apis/101531_1/ENZOMOLOSSI/1.0.0
# API de Gerenciamento de Tarefas

Este README fornece um guia passo a passo para criar uma API de gerenciamento de tarefas utilizando o Spring Boot.

## Configurações Iniciais

1. Utilize o Spring Initializer para criar um novo projeto Spring Boot.
2. Defina as seguintes configurações:
   - Projeto: Maven
   - Linguagem: Java (versão 22)
   - Spring Boot: 3.2.5
   - Defina o nome do grupo e do artefato do seu projeto.
3. Adicione as seguintes dependências:
   - Spring Web
   - Spring Data JPA
   - H2 Database (ou outro banco de dados de sua preferência)

## Estrutura do Projeto

1. Crie os seguintes pacotes:
   - `entities`
   - `repositories`
   - `controllers`
   - `services`

## Classe de Entidade

1. Crie uma classe `Tarefa` com os atributos: `id`, `descricao`, `dataCriacao`, `dataLimite` e `finalizada`.
2. Anote a classe com `@Entity` e faça as demais anotações necessárias nos atributos.

## Repositório

1. Crie uma interface `TarefaRepository` que estenda `JpaRepository<Tarefa, Long>`.
2. Esta interface fornecerá métodos para operações CRUD com a entidade `Tarefa`.

## Controlador (Controller)

1. Crie uma classe `TarefaController` anotada com `@RestController` e `@RequestMapping(value = "/tasks")`.
2. Implemente métodos para:
   - Buscar todas as tarefas
   - Buscar uma tarefa por ID
   - Cadastrar uma nova tarefa
   - Atualizar uma tarefa
   - Deletar uma tarefa

## Serviço (Service)

1. Crie uma classe `TarefaService` para encapsular a lógica de negócios relacionada às operações CRUD.

## Endpoints da API

1. Implemente os endpoints definidos no controlador para cada operação CRUD.

## Testando a API

1. Utilize ferramentas como Postman ou Insomnia para testar os endpoints da API REST.

## Boas Práticas e Estudos Extras

1. Siga as melhores práticas de desenvolvimento de software.
2. Implemente testes unitários para garantir o bom funcionamento do seu código.
3. Documente a API utilizando Swagger ou outras ferramentas de documentação.
