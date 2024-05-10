package com.example.springMongo.controllers;

//import com.sample.springMongo.entities.UserEntity;
//import com.sample.springMongo.models.UserModel;
//import com.sample.springMongo.services.UserService;
import com.example.springMongo.entities.UserEntity;
import com.example.springMongo.models.UserModel;
import com.example.springMongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<UserModel> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id){
        return userService.deleteUserById(id);
    }

    @GetMapping("/{id}")
    public UserModel getById(@PathVariable String id){
        return userService.getUserById(id);
    }
    @PutMapping("/{id}")
    public boolean edit(@PathVariable String id, @RequestBody UserEntity updatedUser){
        return userService.editUser(id, updatedUser);
    }

}
