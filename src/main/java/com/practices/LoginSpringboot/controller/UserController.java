package com.practices.LoginSpringboot.controller;

import com.practices.LoginSpringboot.entity.User;
import com.practices.LoginSpringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<Optional>> getAllActiveUsers(){
        return ResponseEntity.ok(userService.getAllActiveUsers());
    }

}
