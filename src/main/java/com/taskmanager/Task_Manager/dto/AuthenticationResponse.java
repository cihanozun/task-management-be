package com.taskmanager.Task_Manager.dto;

import com.taskmanager.Task_Manager.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;
    private Long userId;
    private UserRole userRole;

}
