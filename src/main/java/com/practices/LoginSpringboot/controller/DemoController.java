package com.practices.LoginSpringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping("/hello")
    @PreAuthorize("hasPermissions('read_all_users')")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from a secured endpoint " + SecurityContextHolder.getContext().getAuthentication().getName());
    }

}
