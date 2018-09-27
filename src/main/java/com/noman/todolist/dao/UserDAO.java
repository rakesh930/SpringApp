package com.noman.todolist.dao;

import com.noman.todolist.domain.User;

public interface UserDAO {

    public void save(User u);

    public void update(User u);
}
