package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.exception.UserNotFoundException;
import com.debuggsbunny.quizdemo.models.User;
import com.debuggsbunny.quizdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(Integer id){
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User id " + id + " not found"));
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    public Boolean deleteUserByID(Integer id) {
        User user = getUserById(id);
        if(null == user){
            return false;
        }
        userRepository.deleteById(id);
        return true;
    }
}
