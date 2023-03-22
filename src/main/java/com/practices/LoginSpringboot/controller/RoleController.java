package com.practices.LoginSpringboot.controller;

import com.practices.LoginSpringboot.entity.ResponseObject;
import com.practices.LoginSpringboot.entity.Role;
import com.practices.LoginSpringboot.entity.RoleRequest;
import com.practices.LoginSpringboot.service.RoleService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/new")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<Role> saveRole(@RequestBody RoleRequest role){
        return ResponseEntity.ok(roleService.saveRole(role));
        //return ResponseEntity.ok(roleService.saveANewRole());
    }
    @GetMapping("/all")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<List<Role>> getAllRoles(){
        return ResponseEntity.ok(roleService.getAllRoles());
    }

    @GetMapping("/read/{id}")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity<ResponseObject> getRoleById(@RequestParam Integer id){
        return ResponseEntity.ok(roleService.getById(id));
    }

}
