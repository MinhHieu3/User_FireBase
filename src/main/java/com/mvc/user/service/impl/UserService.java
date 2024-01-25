package com.mvc.user.service.impl;

import com.mvc.user.model.User;
import com.mvc.user.repository.UserRepository;
import com.mvc.user.service.UserIManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements UserIManager {
    @Autowired
    UserRepository userRepository;
    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {

    }
}
