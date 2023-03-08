package com.practices.LoginSpringboot.service;

import com.practices.LoginSpringboot.entity.Permission;
import com.practices.LoginSpringboot.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public Permission save(Permission permission){
        return permissionRepository.save(permission);
    }

    public List<Permission> getAll(){
        return permissionRepository.findAll();
    }

    public Permission getById(Integer id){
        return permissionRepository.getReferenceById(id);
    }

    public Permission update(Permission permission){
        return permissionRepository.save(permission);
    }

    public void delete(Integer id){
        permissionRepository.deleteById(id);
    }

}
