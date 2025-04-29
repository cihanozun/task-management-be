package com.taskmanager.Task_Manager.dto;

import com.taskmanager.Task_Manager.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String password;

    private UserRole userRole;
}
