package com.taskmanager.Task_Manager.dto;

import com.taskmanager.Task_Manager.enums.TaskStatus;
import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {
    private Long id;

    private String title;

    private String description;

    private Date dueDate;

    private String priority;

    private TaskStatus taskStatus;

    private Long employeeId;

    private String employeeName;
}
