package com.practices.LoginSpringboot.controller;

import com.practices.LoginSpringboot.entity.RegisterRequest;
import com.practices.LoginSpringboot.entity.User;
import com.practices.LoginSpringboot.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<List<Optional>> getAllActiveUsers(){
        return ResponseEntity.ok(userService.getAllActiveUsers());
    }

    @PutMapping("/update/{id}")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<User> updateUser(@RequestParam Integer id, @RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.updateUserById(id, request));
    }

}
