
package com.noman.todolist.service;

import com.noman.todolist.domain.Todo;
import com.noman.todolist.domain.User;

public interface UserService {
    public void register(User u);
    
    public User login(String loginName, String password);
    public void saveTodo(Todo t);
      
}
