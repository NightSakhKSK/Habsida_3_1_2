package com.example.habsida_3_1_2v4.service;

import com.example.habsida_3_1_2v4.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(Long id);

    public void deleteUser(Long id);
}
