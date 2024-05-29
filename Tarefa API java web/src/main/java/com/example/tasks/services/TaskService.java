package com.example.tasks.services;

import com.example.tasks.entities.Task;
import com.example.tasks.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Optional<Task> findById(Long id) {
        return repository.findById(id);
    }

    public void save(Task task) {
        repository.save(task);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void update(Long id, Task task) {
        Task currentTask = repository.findTaskById(id);

        currentTask.setDataCriacao(task.getDataCriacao());
        currentTask.setDataLimite(task.getDataLimite());
        currentTask.setDescricao(task.getDescricao());
        currentTask.setFinalizada(task.isFinalizada());

        repository.save(currentTask);
    }
}
