package com.tnsif.PlacementProject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tnsif.PlacementProject.Entities.User;
import com.tnsif.PlacementProject.Repositories.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepo userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getUserById(Long id){
		return userRepository.findById(id).orElse(null);
	}
	
	public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
	
}
