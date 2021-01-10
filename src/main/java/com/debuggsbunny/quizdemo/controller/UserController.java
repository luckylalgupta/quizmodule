package com.debuggsbunny.quizdemo.controller;

import com.debuggsbunny.quizdemo.exception.UserException;
import com.debuggsbunny.quizdemo.exception.UserNotFoundException;
import com.debuggsbunny.quizdemo.models.User;
import com.debuggsbunny.quizdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        logger.debug("Adding a user "+user);
        return userService.addUser(user);
    }

    @PutMapping(value="/")
    public User updateUser(@RequestBody User user) {
        logger.debug("updating a user "+user);
        return userService.updateUser(user);

    }
    @DeleteMapping(value="/{id}")
    public boolean deleteUserById(@PathVariable("id") Integer id){
        if(id <= 0) {
            throw new UserNotFoundException("User Id is invalid. It must be greater than 0.");
        }
        return userService.deleteUserByID(id);
    }

    @GetMapping(value="/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        if(id <= 0) {
            throw new UserNotFoundException("User Id is invalid. It must be greater than 0.");
        }
        return userService.getUserById(id);
    }
    @GetMapping(value ="/all")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

}
