package com.prototype.controller;


import com.prototype.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/user"})
public class UserController {

    List<User> users = new ArrayList<>();

    @GetMapping("/all")
    @ResponseBody
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getUserById(@PathVariable String id) {
        Optional<User> optionalUser = users.stream().filter(user -> user.getId().equals(id)).findFirst();
        return optionalUser.orElse(null);
    }

    @PostMapping
    @ResponseBody
    public HttpStatus saveUser(@RequestBody User user) {
        users.add(user);
        return HttpStatus.OK;
    }

}
