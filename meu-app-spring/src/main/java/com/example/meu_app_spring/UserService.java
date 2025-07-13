package com.example.meu_app_spring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return List.of(
                new User("Alice" /*, "alice@mail.com"*/),
                new User("Bob" /*, "bob@mail.com"*/),
                new User("Charlie"/*, "charlie@mail.com"*/)
        );
    }

    public User createUser(User user) {
        return user;
    }
}
