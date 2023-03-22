package com.practices.LoginSpringboot.controller;

import com.practices.LoginSpringboot.entity.Permission;
import com.practices.LoginSpringboot.entity.PermissionRequest;
import com.practices.LoginSpringboot.entity.ResponseObject;
import com.practices.LoginSpringboot.service.PermissionService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @PostMapping("/new")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<Permission> newPermission(@RequestBody PermissionRequest request){
        return ResponseEntity.ok(permissionService.save(request));
    }

    @GetMapping("/read/{id}")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<ResponseObject> getPermissionById(@RequestParam Integer id){
        return ResponseEntity.ok((permissionService.getById(id)));
    }

    @GetMapping("/read/all")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<List<Permission>> getAllPermissions(){
        return ResponseEntity.ok(permissionService.getAll());
    }
}
