package com.app.marlonsilvadev.ws_springbootdemo.todo;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validate(TodoEntity todo) {
        if (hasExistingDescription(todo.getDescription())) {
            throw new IllegalArgumentException("Description already exists");
        }

    }

    private boolean hasExistingDescription(String description) {
        return repository.existsByDescription(description);
    }

}
