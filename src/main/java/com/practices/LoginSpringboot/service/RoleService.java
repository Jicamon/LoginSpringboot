package com.practices.LoginSpringboot.service;

import com.practices.LoginSpringboot.entity.Role;
import com.practices.LoginSpringboot.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Optional<List<Role>> getAllRoles(){
        return Optional.of(roleRepository.findAll());
    }
}
