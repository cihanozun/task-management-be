package com.taskmanager.Task_Manager.controller.employee;


import com.taskmanager.Task_Manager.dto.CommentDTO;
import com.taskmanager.Task_Manager.dto.TaskDTO;
import com.taskmanager.Task_Manager.services.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskDTO>> getTasksByUserId(Long userId) {
        return ResponseEntity.ok(employeeService.getTasksByUserId());
    }

    @GetMapping("/task/{id}/{status}")
    public  ResponseEntity<TaskDTO> updateTask(@PathVariable Long id, @PathVariable String status) {
        TaskDTO updatedTaskDTO = employeeService.updateTask(id,status);
        if(updatedTaskDTO == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(updatedTaskDTO);
    }


    @GetMapping("/task/{id}")
    public ResponseEntity<TaskDTO> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getTaskById(id));
    }

    @PostMapping("/task/comment/{taskId}")
    public ResponseEntity<CommentDTO> createComment(@PathVariable Long taskId, @RequestParam String content){
        CommentDTO createdCommentDTO = employeeService.createComment(taskId,content);
        if(createdCommentDTO == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCommentDTO);
    }

    @GetMapping("/comments/{taskId}")
    public ResponseEntity<List<CommentDTO>> getCommentsByTaskId(@PathVariable Long taskId){
        return ResponseEntity.ok(employeeService.getCommentsByTaskId(taskId));
    }
}
