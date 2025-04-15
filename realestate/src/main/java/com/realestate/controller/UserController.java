package com.realestate.controller;

import com.realestate.model.user;
import com.realestate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




    @RestController
    @RequestMapping("/api/users")
    public class UserController {

        @Autowired
        private UserRepository userRepository;

        // Get all users
        @GetMapping
        public List<user> getAllUsers() {
            return userRepository.findAll();
        }

        // Add a new user
        @PostMapping
        public user createUser(@RequestBody user newUser) {
            return userRepository.save(newUser);
        }

//        @PostMapping
//        public User createUser(@RequestBody User user) {
//            return userRepository.save(user);
//        }
    }

