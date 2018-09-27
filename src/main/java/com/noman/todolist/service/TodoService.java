/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.todolist.service;

import com.noman.todolist.domain.Todo;
import java.util.List;

public interface TodoService {

    public void save(Todo t);

    public void update(Todo t);

    public void delete(Integer todoId);

    public Todo findById(Integer todoId);

    public List<Todo> findUserTodo(Integer userId);

    public List<Todo> findByPriority(Integer userId);

    public List<Todo> findUserTodo(Integer userId, String txt);

    public List<Todo> findUserTodoOnlyHigh(Integer userId);

    public List<Todo> findUserTodoOnlyMedium(Integer userId);

    public List<Todo> findUserTodoOnlyLow(Integer userId);

}
