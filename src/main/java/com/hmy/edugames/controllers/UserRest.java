package com.hmy.edugames.controllers;

import com.hmy.edugames.model.Users;
import com.hmy.edugames.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserRest {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUserAPI(@RequestBody Users user){
        user = userService.newUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUserAPI(@PathVariable("id") Long id, @RequestBody Users user){
        user = userService.update(id,user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserAPI(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>("User deleted succesfully",HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getUsersAPI(){
        List<Users> usersList = userService.getUsers();
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserAPI(@PathVariable("id") Long id){
        Optional<Users> user = userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
