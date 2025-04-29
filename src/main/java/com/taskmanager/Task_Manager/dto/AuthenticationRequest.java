package com.taskmanager.Task_Manager.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;
    private String password;

}
