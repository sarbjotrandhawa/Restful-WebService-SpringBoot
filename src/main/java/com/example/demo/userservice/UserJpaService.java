package com.example.demo.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

import com.example.demo.dao.UserRepository;

@Service
public class UserJpaService {

	@Autowired
	private UserRepository userRepository;

	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> retrieveUser(int id) {
		Optional<User> resource = userRepository.findById(id);
		return resource;
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

	public User createUser(User user) {
		
		User savedUser = userRepository.save(user);
		return savedUser;

	}
}
