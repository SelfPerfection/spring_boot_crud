package ru.selfperfection.spring.springboot.spring_boot_crud.dao;

import ru.selfperfection.spring.springboot.spring_boot_crud.model.User;

import java.util.List;

public interface UserDao {

    User getUserById(int id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> getAllUsers();
}

