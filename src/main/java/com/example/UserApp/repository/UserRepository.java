package com.example.UserApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserApp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
