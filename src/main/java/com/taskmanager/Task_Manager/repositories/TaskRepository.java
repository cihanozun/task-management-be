package com.taskmanager.Task_Manager.repositories;

import com.taskmanager.Task_Manager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {


}
