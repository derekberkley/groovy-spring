package com.codeup.groovy_spring.repositories;

import com.codeup.groovy_spring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}