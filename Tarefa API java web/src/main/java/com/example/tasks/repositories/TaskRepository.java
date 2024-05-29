package com.uri.progweb.userdep.repositories;

import com.uri.progweb.userdep.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findTaskById(Long id);

    void deleteById(Long id);
}
