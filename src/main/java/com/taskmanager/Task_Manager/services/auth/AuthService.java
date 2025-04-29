package com.taskmanager.Task_Manager.services.auth;

import com.taskmanager.Task_Manager.dto.SignupRequest;
import com.taskmanager.Task_Manager.dto.UserDto;

public interface AuthService {


    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
