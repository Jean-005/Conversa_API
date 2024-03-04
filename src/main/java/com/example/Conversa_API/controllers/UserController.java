package com.example.Conversa_API.controllers;

import com.example.Conversa_API.models.User;
import com.example.Conversa_API.models.UserDTO;
import com.example.Conversa_API.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/admin")
    public ResponseEntity<List<User>> getAllUsers(){
      List<User> users = userService.getAllUsers();
      return new ResponseEntity<>(users, HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        Optional<User> foundUser = userService.findUser(id);
        if(foundUser.isPresent()){
            return new ResponseEntity<>(foundUser.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody UserDTO userDTO){
      User newUser = userService.saveUser(userDTO);
      return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
       Optional<User> deletedUser = userService.deleteUser(id);
       if(deletedUser.isPresent()){
           return new ResponseEntity<>(deletedUser.get(), HttpStatus.OK);
       }
       return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }








}