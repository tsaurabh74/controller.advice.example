package com.saurabh.controller.advice.example.repository;

import com.saurabh.controller.advice.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
