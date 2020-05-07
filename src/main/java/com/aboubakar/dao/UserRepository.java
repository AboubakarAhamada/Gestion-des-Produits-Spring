package com.aboubakar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aboubakar.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
