package com.practices.LoginSpringboot.service;

import com.practices.LoginSpringboot.entity.*;
import com.practices.LoginSpringboot.repository.PermissionRepository;
import com.practices.LoginSpringboot.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
public class RoleService {

    @Autowired
    private final RoleRepository roleRepository;

    @Autowired
    private final PermissionRepository permissionRepository;

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Role saveRole(RoleRequest request){

        var role = Role.builder()
                .name(request.getName())
                .description(request.getDescription())
                .rolePermissions(permissionRepository.findAllById(request.getPermissionIds()))
                .build();

        return roleRepository.save(role);
    }

    public List<Role> getAll(){
        return roleRepository.findAll();
    }

    public ResponseObject getById(Integer id){
        try{
            return new ResponseObject(Optional.of(roleRepository.findById(id).get()), "");
        } catch (NoSuchElementException nSEE) {
            return new ResponseObject(null, nSEE.getMessage());
        }

    }

    public Role update(Role permission){
        return roleRepository.save(permission);
    }

    public void delete(Integer id){
        roleRepository.deleteById(id);
    }
}
