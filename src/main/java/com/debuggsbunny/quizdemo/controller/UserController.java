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
@RequestMapping("/api")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public User AddUser(@RequestBody User user){
        logger.debug("Adding an user");
        return userService.addUser(user);
    }

    @RequestMapping(value="/updateUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User createOrUpdateBook(@RequestBody User user) {
        logger.debug("updating an user");
        if (user != null && StringUtils.isEmpty(user.getName()) ) {
            throw new UserException("User name should not be empty.");
        }
        return userService.updateUser(user);

    }
    @RequestMapping(value="/user/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteUserById(@PathVariable("id") Integer id){
        if(id <= 0) {
            throw new UserNotFoundException("User Id is invalid. It must be greater than 0.");
        }
        return userService.deleteByUserID(id);
    }

    @RequestMapping(value="/getUserById/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserById(@PathVariable("id") Integer id){
        if(id <= 0) {
            throw new UserNotFoundException("User Id is invalid. It must be greater than 0.");
        }
        return userService.getUserById(id);
    }
    @RequestMapping(value ="/getAllUser",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

}
