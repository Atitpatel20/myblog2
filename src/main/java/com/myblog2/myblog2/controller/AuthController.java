package com.myblog2.myblog2.controller;

import com.myblog2.myblog2.entity.Role;
import com.myblog2.myblog2.entity.User;
import com.myblog2.myblog2.payload.SignUpDto;
import com.myblog2.myblog2.repository.RoleRepository;
import com.myblog2.myblog2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> createRegistration(@RequestBody SignUpDto signUpDto) {
        if (userRepository.existsByEmail(signUpDto.getEmail())) {
            return new ResponseEntity<>("Email is already exists", HttpStatus.BAD_REQUEST);

        }
        if (userRepository.existsByUsername(signUpDto.getUsername())) {
            return new ResponseEntity<>("Username is already exists", HttpStatus.BAD_REQUEST);

        }
        User user = new User();
        user.setName(signUpDto.getName());
        user.setUsername(signUpDto.getUsername());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        Role roles = roleRepository.findByName(signUpDto.getRoleType()).get();
        Set<Role>convertToSet= new HashSet<>();
        convertToSet.add(roles);
        user.setRoles(convertToSet);
        userRepository.save(user);
        return new ResponseEntity<>("Registration done successfully", HttpStatus.CREATED);
    }
}
