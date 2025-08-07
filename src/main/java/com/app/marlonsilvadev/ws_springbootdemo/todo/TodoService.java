package com.app.marlonsilvadev.ws_springbootdemo.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository repository, TodoValidator validator, MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity save(TodoEntity todo) {
        validator.validate(todo);

        return repository.save(todo);
    }

    public void update(TodoEntity todo) {
        repository.save(todo);
        String status = todo.getCompleted() == Boolean.TRUE ? "Concluído" : "Pendente";

        mailSender.send("Todo updated with status: " + status + "Description: " + todo.getDescription());
    }

    public TodoEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
