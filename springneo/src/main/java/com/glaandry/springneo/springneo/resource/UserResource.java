package com.glaandry.springneo.springneo.resource;

import com.glaandry.springneo.springneo.model.User;
import com.glaandry.springneo.springneo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    public Collection<User> getAll() {
        return userService.getAll();
    }
}
