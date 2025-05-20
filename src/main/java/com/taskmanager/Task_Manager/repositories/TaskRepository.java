package com.taskmanager.Task_Manager.repositories;

import com.taskmanager.Task_Manager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByTitleContaining(String title);

    List<Task>  findAllByUserId(Long userId);
}
