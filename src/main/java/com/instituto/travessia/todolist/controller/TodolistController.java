package com.instituto.travessia.todolist.controller;

import com.instituto.travessia.todolist.model.Todolist;
import com.instituto.travessia.todolist.services.TodolistService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.spi.ToolProvider;


// CONTROLLER irá receber as requisições/HTTP
@RestController
@RequestMapping(value = "/api")
@Tag(name = "API", description = "Gerenciamento de tarefas")

public class TodolistController {

    @Autowired
    private TodolistService todolistService;

    @PostMapping("/create")
    @Operation  (
                summary = "Cadastrar tarefa",
                description = "Cadastra uma nova tarefa que ainda não consta na lista preenchendo os seguintes campos" +
                              "(nome, prazo e status - em andamento, concluido ou pendente)"
                )
    public ResponseEntity<Todolist> create(@Valid @RequestBody Todolist todolist) {
        Todolist newTodolist = todolistService.create(todolist);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTodolist);
    }


    @GetMapping("/list")
    @Operation  (
                summary = "Listar todas as tarefas",
                description = "Lista todas as tarefas cadastradas"
                )
    public List<Todolist> getAll() {
        return todolistService.getAll();
    }


    @GetMapping("/list/status")
    @Operation  (
                summary = "Listar tarefa pelo status",
                description = "Lista as tarefas pelo status desejado - em andamento, pendente e concluido"
                )
    public List<Todolist> getStatus(@RequestParam String status) {
        return todolistService.getStatus(status);
    }


    @PutMapping("/update/{id}")
    @Operation (
                summary = "Atualizar uma tarefa",
                description = "Atualiza uma lista de tarefas pelo ID"
                )
    public ResponseEntity<Todolist> update(@PathVariable Long id, @Valid @RequestBody Todolist todolist) {
        Todolist listAtualizada = todolistService.update(id, todolist);

        if (listAtualizada != null) {
            return ResponseEntity.ok(listAtualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    @Operation (
                summary = "Deletar uma lista de tarefa",
                description = "Deleta uma lista de tarefas pelo ID"
                )
    public ResponseEntity<Void> delete(@PathVariable long id) {
        todolistService.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}

