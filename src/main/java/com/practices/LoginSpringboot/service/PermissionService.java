package com.practices.LoginSpringboot.service;

import com.practices.LoginSpringboot.entity.Permission;
import com.practices.LoginSpringboot.entity.PermissionRequest;
import com.practices.LoginSpringboot.entity.ResponseObject;
import com.practices.LoginSpringboot.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PermissionService {

    @Autowired
    private final PermissionRepository permissionRepository;

    public Permission save(PermissionRequest request){

        var permission = Permission.builder()
                .name(request.getName())
                .description(request.getDescription())
                .roles(request.getRoles())
                .build();

        return permissionRepository.save(permission);
    }

    public List<Permission> getAll(){
        return permissionRepository.findAll();
    }

    public ResponseObject getById(Integer id){
        try{
            return new ResponseObject(Optional.of(permissionRepository.findById(id).get()), "") ;
        } catch (NoSuchElementException nSEE){
            return new ResponseObject(null, nSEE.getMessage());
        }
    }

    public Permission update(Permission permission){
        return permissionRepository.save(permission);
    }

    public void delete(Integer id){
        permissionRepository.deleteById(id);
    }

}
