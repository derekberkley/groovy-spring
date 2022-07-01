package com.codeup.groovy_spring.repositories;

import com.codeup.groovy_spring.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsRepository extends JpaRepository<Ad, Long> {

}