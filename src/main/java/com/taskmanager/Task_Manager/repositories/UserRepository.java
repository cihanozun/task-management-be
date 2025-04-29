package com.taskmanager.Task_Manager.repositories;

import com.taskmanager.Task_Manager.entities.User;
import com.taskmanager.Task_Manager.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String username);

    Optional<User> findByUserRole(UserRole userRole);

}
