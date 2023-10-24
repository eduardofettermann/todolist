package com.efettermann.todolist.controller;

import com.efettermann.todolist.model.Task;
import com.efettermann.todolist.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {
    private TaskService taskService;

    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }
}
