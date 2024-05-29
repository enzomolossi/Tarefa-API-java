Api(jogar no swaggerhub):openapi: 3.0.3
                         info:
                           title: API de Tarefas
                           description: API para gerenciamento de tarefas
                           version: 1.0.0
                         servers:
                           - url: 'https://seu-servidor.com/api/task'
                         paths:
                           /tasks:
                             get:
                               summary: Retorna todas as tarefas
                               responses:
                                 '200':
                                   description: Lista de tarefas recuperada com sucesso
                                   content:
                                     application/json:
                                       schema:
                                         type: array
                                         items:
                                           $ref: '#/components/schemas/Task'
                             post:
                               summary: Cria uma nova tarefa
                               requestBody:
                                 required: true
                                 content:
                                   application/json:
                                     schema:
                                       $ref: '#/components/schemas/Task'
                               responses:
                                 '200':
                                   description: Tarefa criada com sucesso
                                   content:
                                     application/json:
                                       schema:
                                         $ref: '#/components/schemas/Task'
                           /tasks/{id}:
                             get:
                               summary: Retorna uma tarefa pelo ID
                               parameters:
                                 - in: path
                                   name: id
                                   required: true
                                   schema:
                                     type: integer
                                     format: int64
                               responses:
                                 '200':
                                   description: Tarefa encontrada
                                   content:
                                     application/json:
                                       schema:
                                         $ref: '#/components/schemas/Task'
                                 '404':
                                   description: Tarefa não encontrada
                             put:
                               summary: Atualiza uma tarefa existente
                               parameters:
                                 - in: path
                                   name: id
                                   required: true
                                   schema:
                                     type: integer
                                     format: int64
                               requestBody:
                                 required: true
                                 content:
                                   application/json:
                                     schema:
                                       $ref: '#/components/schemas/Task'
                               responses:
                                 '200':
                                   description: Tarefa atualizada com sucesso
                                   content:
                                     application/json:
                                       schema:
                                         $ref: '#/components/schemas/Task'
                                 '404':
                                   description: Tarefa não encontrada
                             delete:
                               summary: Exclui uma tarefa pelo ID
                               parameters:
                                 - in: path
                                   name: id
                                   required: true
                                   schema:
                                     type: integer
                                     format: int64
                               responses:
                                 '200':
                                   description: Tarefa excluída com sucesso
                                 '404':
                                   description: Tarefa não encontrada
                         components:
                           schemas:
                             Task:
                               type: object
                               properties:
                                 id:
                                   type: integer
                                   format: int64
                                 descricao:
                                   type: string
                                 dataCriacao:
                                   type: string
                                   format: date-time
                                 dataLimite:
                                   type: string
                                   format: date-time
                                 finalizada:
                                   type: boolean
