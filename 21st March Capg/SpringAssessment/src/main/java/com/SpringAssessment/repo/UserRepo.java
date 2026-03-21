package com.SpringAssessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.SpringAssessment.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
	User findByEmail(String email);
}
