package com.saurabh.controller.advice.example.service;

import com.saurabh.controller.advice.example.dto.UserRequest;
import com.saurabh.controller.advice.example.entity.User;
import com.saurabh.controller.advice.example.exception.UserNotFoundException;
import com.saurabh.controller.advice.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {
        User user = User.build(0,userRequest.getName(),userRequest.getEmail(),
                userRequest.getMobile(),userRequest.getGender(),userRequest.getAge(),userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = userRepository.findByUserId(id);
        if(user != null) {
            return user;
        } else {
            throw new UserNotFoundException("User not found with id : " + id);
        }
    }
}
