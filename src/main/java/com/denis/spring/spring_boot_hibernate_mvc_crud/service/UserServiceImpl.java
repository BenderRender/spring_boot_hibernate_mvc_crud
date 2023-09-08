package com.denis.spring.spring_boot_hibernate_mvc_crud.service;

import com.denis.spring.spring_boot_hibernate_mvc_crud.model.User;
import com.denis.spring.spring_boot_hibernate_mvc_crud.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserRepositories userRepositories;

    @Autowired
    public UserServiceImpl(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }
    @Override
    public List<User> findAll(){
        return userRepositories.findAll();
    }
    @Override
    public User findById(int id) {
        Optional<User> foundUser = userRepositories.findById(id);
        return foundUser.orElse(null);
    }
    @Override
    @Transactional
    public void save(User user){
        userRepositories.save(user);
    }
    @Override
    @Transactional
    public void update(int id, User updateUser) {
        updateUser.setId(id);
        userRepositories.save(updateUser);
    }
    @Override
    @Transactional
    public void delete(int id) {
        userRepositories.deleteById(id);
    }
}
