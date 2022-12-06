package com.fatou.validation.in.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatou.validation.in.SpringBoot.model.User;
import com.fatou.validation.in.SpringBoot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
		
	}
	
	

}
