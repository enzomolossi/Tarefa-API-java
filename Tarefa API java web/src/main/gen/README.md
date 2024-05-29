# org.openapitools.client - Biblioteca de cliente Kotlin para a API de Tarefas

## Requisitos

* Kotlin 1.4.30
* Gradle 6.8.3

## Construção

Primeiro, gere o script do wrapper do Gradle:

gradle wrapper

Em seguida, execute:

./gradlew check assemble

Este comando executa todos os testes e empacota a biblioteca.

## Recursos/Notas de Implementação

* Suporta entradas/saídas JSON, entradas de arquivo e entradas de formulário.
* Suporta formatos de coleção para parâmetros de consulta: csv, tsv, ssv, pipes.
* Alguns tipos de Kotlin e Java estão totalmente qualificados para evitar conflitos com tipos definidos em definições OpenAPI.
* A implementação do ApiClient tem como objetivo reduzir a contagem de métodos, beneficiando especialmente os alvos Android.

<a name="documentation-for-api-endpoints"></a>
## Documentação para Pontos Finais da API

Todos os URIs são relativos a *http://localhost:8080*

Classe | Método | Requisição HTTP | Descrição
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**tasksGet**](docs/DefaultApi.md#tasksget) | **GET** /tasks | Recupera todas as tarefas
*DefaultApi* | [**tasksIdGet**](docs/DefaultApi.md#tasksidget) | **GET** /tasks/{id} | Recupera uma tarefa pelo ID
*DefaultApi* | [**tasksPost**](docs/DefaultApi.md#taskspost) | **POST** /tasks | Cria uma nova tarefa


<a name="documentation-for-models"></a>
## Documentação para Modelos

- [org.openapitools.client.models.Task](docs/Task.md)


<a name="documentation-for-authorization"></a>
## Documentação para Autorização

Todos os pontos finais não exigem autorização.
