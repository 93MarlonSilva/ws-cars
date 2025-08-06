package com.app.marlonsilvadev.ws_springbootdemo.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    boolean existsByDescription(String description);
}
