package com.app.marlonsilvadev.ws_springbootdemo.todo;

public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository todoRepository) {
        this.repository = todoRepository;
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
