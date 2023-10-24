package com.efettermann.todolist.repository;

import com.efettermann.todolist.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task,String> {
}
