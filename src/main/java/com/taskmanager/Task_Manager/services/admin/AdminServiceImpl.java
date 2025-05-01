package com.taskmanager.Task_Manager.services.admin;


import com.taskmanager.Task_Manager.dto.UserDto;
import com.taskmanager.Task_Manager.entities.User;
import com.taskmanager.Task_Manager.enums.UserRole;
import com.taskmanager.Task_Manager.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{


    private final UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {
        return userRepository.findAll().stream().filter(user -> user.getUserRole() == UserRole.EMPLOYEE).map(User::getUserDto).collect(Collectors.toList());
    }
}
