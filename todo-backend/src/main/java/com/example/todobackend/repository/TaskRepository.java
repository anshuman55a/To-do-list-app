// TaskRepository.java
package com.example.todobackend.repository;

import com.example.todobackend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed);

    void deleteByIdAndCompleted(Long id, boolean completed);
}
