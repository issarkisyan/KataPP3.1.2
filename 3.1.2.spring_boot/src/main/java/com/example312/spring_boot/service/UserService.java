package com.example312.spring_boot.service;

import com.example312.spring_boot.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    List<User> readListUsers();

    void update(long id, User updatedUser);

    void delete(long id);

    User show(long id);
}