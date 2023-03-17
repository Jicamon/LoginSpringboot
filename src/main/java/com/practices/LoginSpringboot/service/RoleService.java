package com.practices.LoginSpringboot.service;

import com.practices.LoginSpringboot.entity.Permission;
import com.practices.LoginSpringboot.entity.Role;
import com.practices.LoginSpringboot.entity.RoleRequest;
import com.practices.LoginSpringboot.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {

    @Autowired
    private final RoleRepository roleRepository;

    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Role saveRole(RoleRequest request){

        var role = Role.builder()
                .name(request.getName())
                .description(request.getDescription())
                .rolePermissions(request.getRolePermissions())
                .build();

        return roleRepository.save(role);
    }

    public List<Role> getAll(){
        return roleRepository.findAll();
    }

    public Role getById(Integer id){
        return roleRepository.getReferenceById(id);
    }

    public Role update(Role permission){
        return roleRepository.save(permission);
    }

    public void delete(Integer id){
        roleRepository.deleteById(id);
    }
}
