package com.app.marlonsilvadev.ws_springbootdemo.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private TodoValidator todoValidator;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity save(TodoEntity todo) {

        return todoRepository.save(todo);
    }

    public TodoEntity update(TodoEntity todo) {

        return todoRepository.save(todo);
    }

    public TodoEntity getById(Integer id) {
        return todoRepository.findById(id).orElse(null);
    }
}
