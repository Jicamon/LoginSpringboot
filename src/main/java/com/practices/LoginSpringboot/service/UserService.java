package com.practices.LoginSpringboot.service;

import com.practices.LoginSpringboot.entity.AuthenticationResponse;
import com.practices.LoginSpringboot.entity.RegisterRequest;
import com.practices.LoginSpringboot.entity.ResponseObject;
import com.practices.LoginSpringboot.entity.User;
import com.practices.LoginSpringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public List<Optional> getAllActiveUsers(){
        return Collections.singletonList(userRepository.findAllByIsActive(true));
    }

    public ResponseObject getById(Integer id){
        try {
            return new ResponseObject(Optional.of(userRepository.findById(id).get()), "");
        } catch (NoSuchElementException nSEE){
            return new ResponseObject(null, nSEE.getMessage());
        }
    }

    public ResponseObject getByUsername(String username){
        try {
            return new ResponseObject(Optional.of(userRepository.findByUsername(username).get()), "");
        } catch (NoSuchElementException nSEE){
            return new ResponseObject(null, nSEE.getMessage());
        }
    }

    public User updateUserById(Integer id, RegisterRequest request) {

        User thisUser = userRepository.findByUsername(
                SecurityContextHolder.getContext().getAuthentication().getName()
        ).orElseThrow();
        User userToUpdate = userRepository.findById(id).orElseThrow();

        return null;
    }
}
