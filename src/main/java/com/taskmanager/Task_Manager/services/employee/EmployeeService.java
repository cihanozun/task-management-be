package com.taskmanager.Task_Manager.services.employee;

import com.taskmanager.Task_Manager.dto.CommentDTO;
import com.taskmanager.Task_Manager.dto.TaskDTO;
import com.taskmanager.Task_Manager.entities.Task;

import java.util.List;

public interface EmployeeService {

    List<TaskDTO> getTasksByUserId();

    TaskDTO updateTask(Long id, String status);

    TaskDTO getTaskById(Long id);

    CommentDTO createComment(Long taskId, String content);

    List<CommentDTO> getCommentsByTaskId(Long taskId);
}
