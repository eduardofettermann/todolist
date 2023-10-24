package com.efettermann.todolist.service;

import com.efettermann.todolist.model.Task;
import com.efettermann.todolist.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;
}
