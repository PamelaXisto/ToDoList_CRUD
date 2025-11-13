# 📝 To-do List - API Spring Boot

Mini lista de tarefas desenvolvida em **Java Spring Boot**, usando **H2 Database em memória** 🏦 e documentação via **Swagger** 📖.

---

## ✨ Funcionalidades

- ➕ Criar tarefas
- 📋 Listar tarefas
- 🔍 Filtrar tarefas por status (`pendente`, `em andamento`, `concluido`)
- ✏️ Atualizar tarefas
- ❌ Deletar tarefas

---

## 🛠 Tecnologias

- Java 23.0.1 ☕
- Spring Boot 3.x 🚀
- H2 Database (em memória) 🏦
- Spring Data JPA
- Swagger/Postman (OpenAPI) 📖

---

## 🔗 Endpoints

| Método | Endpoint             | Descrição                       |
|--------|--------------------|--------------------------------|
| POST   | `/api/create`       | Criar tarefa                    |
| GET    | `/api/list`         | Listar todas as tarefas         |
| GET    | `/api/list/status`  | Filtrar tarefas por status      |
| PUT    | `/api/update/{id}`  | Atualizar tarefa pelo ID        |
| DELETE | `/api/delete/{id}`  | Deletar tarefa pelo ID          |

---

## 🚀 Como Rodar o Projeto ToDoList

Siga os passos abaixo para rodar o projeto localmente.

---

### 1. Clone o repositório
```bash
git clone https://github.com/PamelaXisto/ToDoList_CRUD.git
```


### 2. Entre na pasta do projeto
```bash
cd todolist
```

### 3. Compile e rode usando Maven
```bash
mvn spring-boot:run
```

### 4. Acesse a aplicação no navegador
```bash
http://localhost:8080
```

### 5. Documentação da API (Swagger)
```bash
http://localhost:8080/swagger-ui/index.html
```

---

## 📝 Licença

MIT License © 2025 Pâmela Xisto Santos

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
