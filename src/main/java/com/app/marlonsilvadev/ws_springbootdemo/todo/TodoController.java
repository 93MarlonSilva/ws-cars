package com.app.marlonsilvadev.ws_springbootdemo.todo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
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
    public TodoEntity saveTodo(@RequestBody TodoEntity todo) {
        return this.service.save(todo);
    }

    @PutMapping("{id}")
    public TodoEntity update(@PathVariable("id") Integer id, @RequestBody TodoEntity todo) {

        todo.setId(id);
        return this.service.update(todo);

    }

    @GetMapping("{id}")
    public TodoEntity getById(@PathVariable("id") Integer id) {
        return this.service.getById(id);
    }

}
