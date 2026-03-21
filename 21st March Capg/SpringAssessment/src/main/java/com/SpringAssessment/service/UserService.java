package com.SpringAssessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.SpringAssessment.Exception.IncorrectPasswordException;
import com.SpringAssessment.Exception.UserAlreadyExistException;
import com.SpringAssessment.Exception.UserNotFoundException;
import com.SpringAssessment.model.User;
import com.SpringAssessment.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
    private BCryptPasswordEncoder encoder;
	
	public String register(User user) {
		if (userRepo.findById(user.getUsername()).isPresent()) {
			throw new UserAlreadyExistException("Username already exists. Choose a different username");
		}
		if (userRepo.findByEmail(user.getEmail()) != null) {
			throw new UserAlreadyExistException("Email already registered");
		}
		user.setPassword(encoder.encode(user.getPassword()));
		userRepo.save(user);
		return "User registered successfully";

	}

	public String login(String username, String password) {

		User user = userRepo.findById(username).orElseThrow(() -> new UserNotFoundException("User not found"));
		if (!encoder.matches(password, user.getPassword())) {
			throw new IncorrectPasswordException("Incorrect password.Try again!");
		}

		return "Login successful";
	}

}
