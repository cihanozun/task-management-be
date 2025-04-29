package com.taskmanager.Task_Manager.services.jwt;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

    UserDetailsService userDetailService();
}
