package com.practices.LoginSpringboot.service;

import com.practices.LoginSpringboot.entity.AuthenticationResponse;
import com.practices.LoginSpringboot.entity.RegisterRequest;
import com.practices.LoginSpringboot.entity.User;
import com.practices.LoginSpringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Optional> getAllActiveUsers(){
        return Collections.singletonList(userRepository.findAllByIsActive(true));
    }

}
