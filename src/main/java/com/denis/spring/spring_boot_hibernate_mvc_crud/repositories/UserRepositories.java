package com.denis.spring.spring_boot_hibernate_mvc_crud.repositories;

import com.denis.spring.spring_boot_hibernate_mvc_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {

}
