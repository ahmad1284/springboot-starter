package com.hmy.edugames.services;

import com.hmy.edugames.model.Users;
import com.hmy.edugames.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Users newUser(Users user){
        return userRepo.save(user);
    }

    public Users update(Long id, Users user){
        if(userRepo.findById(id).isPresent()){
            user.setUserID(id);
            return userRepo.save(user);
        }
        return null;
    }

    public void deleteUser(Long id){
        if(userRepo.findById(id).isPresent()) {
            userRepo.deleteById(id);
        }
    }

    public List<Users> getUsers(){
        return userRepo.findAll();
    }

    public Optional<Users> getUser(Long id){
        return userRepo.findById(id);
    }
}
