package com.example312.spring_boot.dao;

import com.example312.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    List<User> readListUsers();

    void update(long id, User updatedUser);

    void delete(long id);

    User show(long id);
}
