package com.denis.spring.spring_boot_hibernate_mvc_crud.service;

import com.denis.spring.spring_boot_hibernate_mvc_crud.model.User;
import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(int id);
    public void save(User user);
    public void update(int id, User updatedUser);
    public void delete(int id);
}
