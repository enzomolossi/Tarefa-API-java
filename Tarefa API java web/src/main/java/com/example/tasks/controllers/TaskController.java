package com.uri.progweb.userdep.controllers;

import com.uri.progweb.userdep.entities.Task;
import com.uri.progweb.userdep.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public ResponseEntity<List<Task>> findAllTasks() {
        List<Task> taskList = service.findAllTasks();
        return ResponseEntity.status(HttpStatus.OK).body(taskList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Task>> findTaskById(@PathVariable Long id) {
        Optional<Task> task = service.findTaskById(id);
        return ResponseEntity.status(HttpStatus.OK).body(task);
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        service.createTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return ResponseEntity.status(HttpStatus.OK).body("Tarefa excluída com sucesso!");
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        service.updateTask(id, task);
        return ResponseEntity.status(HttpStatus.OK).body(task);
    }
}
