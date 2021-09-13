package com.glaandry.springneo.springneo.service;

import com.glaandry.springneo.springneo.model.User;
import com.glaandry.springneo.springneo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        //custom query
        return userRepository.getAllUsers();
    }
}
