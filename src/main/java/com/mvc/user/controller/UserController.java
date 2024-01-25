package com.mvc.user.controller;

import com.mvc.user.model.User;
import com.mvc.user.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public ResponseEntity findAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity save(@RequestBody User user){
        return new ResponseEntity<>(userService.save(user),HttpStatus.OK);
    }
}
