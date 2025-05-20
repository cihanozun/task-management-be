package com.taskmanager.Task_Manager.repositories;

import com.taskmanager.Task_Manager.dto.CommentDTO;
import com.taskmanager.Task_Manager.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository  extends JpaRepository<Comment, Long> {


    List<Comment> findAllByTaskId(Long taskId);
}
