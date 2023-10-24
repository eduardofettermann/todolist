package com.efettermann.todolist.service;

import com.efettermann.todolist.model.Task;
import com.efettermann.todolist.model.UpdateTask;
import com.efettermann.todolist.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(UpdateTask updateTask, String id) throws Exception{
        Task taskToUpdate = taskRepository.findById(id)
                .orElseThrow(() -> new Exception("O id não foi encontrado no banco de dados"));
        taskToUpdate.setTitle(updateTask.getTitle());
        taskToUpdate.setDescription(updateTask.getDescription());
        return taskRepository.save(taskToUpdate);
    }
}
