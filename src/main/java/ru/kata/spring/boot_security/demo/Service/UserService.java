package ru.kata.spring.boot_security.demo.Service;


import ru.kata.spring.boot_security.demo.Model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUserById(int id);

    void saveUser(User user);

    void deleteUserById(int id);

    User findByUsername(String username);
}
