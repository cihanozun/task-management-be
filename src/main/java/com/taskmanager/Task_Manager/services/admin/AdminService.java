package com.taskmanager.Task_Manager.services.admin;

import com.taskmanager.Task_Manager.dto.TaskDTO;
import com.taskmanager.Task_Manager.dto.UserDto;

import java.util.List;

public interface AdminService {

    List<UserDto> getUsers();

    TaskDTO createTask(TaskDTO taskDTO);

    List<TaskDTO> getAllTasks();

    void deleteTask(Long id);

    TaskDTO getTaskById(Long id);

    TaskDTO updateTask(Long id,TaskDTO taskDTO);

    List<TaskDTO> searchTaskByTitle(String title);
}
