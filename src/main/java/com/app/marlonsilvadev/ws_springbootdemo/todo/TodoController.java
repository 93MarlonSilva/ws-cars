package com.app.marlonsilvadev.ws_springbootdemo.todo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService todoService) {
        this.service = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo) {
        try {
            return this.service.save(todo);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @PutMapping("{id}")
    public TodoEntity update(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {

        todo.setId(id);
        this.service.update(todo);

        return todo;
    }

    @GetMapping("{id}")
    public TodoEntity getById(@PathVariable("id") Integer id) {
        return this.service.getById(id);
    }

}
