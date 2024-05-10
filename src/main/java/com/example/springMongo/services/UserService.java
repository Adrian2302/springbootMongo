package com.example.springMongo.services;

import com.example.springMongo.entities.UserEntity;
import com.example.springMongo.models.UserModel;
import com.example.springMongo.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserModel> getUsers() {
        List<UserEntity> users = this.userRepository.findAll();

        return users.stream().map(user -> this.modelMapper.map(user, UserModel.class)).toList();
    }

    public UserModel addUser(UserEntity user) {
        final var userAdded = this.userRepository.save(user);
        return this.modelMapper.map(userAdded, UserModel.class);
    }

    public boolean deleteUserById(String id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
//        throw new UserNotFoundException();
    }

    public UserModel getUserById(String id) {
        if (userRepository.existsById(id)) {
            return userRepository.findById(id).map(user -> modelMapper.map(user, UserModel.class)).orElse(null);
        }
        return null;
//        throw new UserNotFoundException();
    }

    public boolean editUser(String id, UserEntity updatedUser){
        if (userRepository.existsById(id)) {
            UserEntity existingUser = userRepository.findById(id).orElse(null);
            if (existingUser != null) {
                existingUser.setUserName(updatedUser.getUserName());
                existingUser.setEmail(updatedUser.getEmail());
                userRepository.save(existingUser);
                return true;
            }
        }
        return false;
    }


}
