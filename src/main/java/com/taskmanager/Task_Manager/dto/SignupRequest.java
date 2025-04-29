package com.taskmanager.Task_Manager.dto;

import lombok.Data;

@Data
public class SignupRequest {

    private String name;
    private String email;
    private String password;
}
