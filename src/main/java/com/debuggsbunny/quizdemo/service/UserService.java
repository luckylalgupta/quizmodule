package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.exception.UserNotFoundException;
import com.debuggsbunny.quizdemo.models.User;
import com.debuggsbunny.quizdemo.repositories.UserRepository;
import javassist.NotFoundException;
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
        User userInfo= null;

        if(user != null && user.getId() > 0) {
            //update book
            userInfo = getUserById(user.getId());

            userInfo.setEmail(user.getEmail());


        }

    }
}
