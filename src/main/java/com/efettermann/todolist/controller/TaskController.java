package com.efettermann.todolist.controller;

import com.efettermann.todolist.model.Task;
import com.efettermann.todolist.model.UpdateTask;
import com.efettermann.todolist.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {
    private TaskService taskService;

    @PostMapping
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PutMapping("/{id}")
    public Task changeTask(@RequestBody UpdateTask updateTask, @PathVariable("id") String id) throws Exception {
        return taskService.updateTask(updateTask,id);

    }
}
