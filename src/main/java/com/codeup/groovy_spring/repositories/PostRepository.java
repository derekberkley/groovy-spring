package com.codeup.groovy_spring.repositories;

import com.codeup.groovy_spring.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// TODO: Create an interface for posts named PostRepository that extends JpaRepository.
public interface PostRepository extends JpaRepository<Post, Long>  {
}
