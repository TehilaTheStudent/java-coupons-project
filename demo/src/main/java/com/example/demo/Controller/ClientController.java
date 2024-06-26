package com.example.demo.Controller;

import com.example.demo.Credentials;

import com.example.demo.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public abstract class ClientController {

    @Autowired
    protected JwtUtils jwtUtils;
    public abstract ResponseEntity<?> loginByCredentials(@RequestBody Credentials credentials);

}
