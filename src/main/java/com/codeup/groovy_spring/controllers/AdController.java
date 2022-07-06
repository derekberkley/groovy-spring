//package com.codeup.groovy_spring.controllers;
//import com.codeup.groovy_spring.models.Ad;
//import com.codeup.groovy_spring.repositories.AdsRepository;
//import com.codeup.groovy_spring.repositories.CategoryRepository;
//import com.codeup.groovy_spring.repositories.UserRepository;
//import com.codeup.groovy_spring.services.EmailService;
//import jdk.jfr.Category;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//class AdController {
//
//    private AdsRepository adDao; //(adsDao aka adsRepository)
//    private UserRepository userRepository;
//    private CategoryRepository categoryRepository;
//
//    private final EmailService emailService;
//
//    public AdController(AdsRepository adDao) { AdsRepository adsDao, UserRepository, userRepository, CategoryRepository categoryRepository, EmailService emailService);
//        this.adDao = adDao;
//        this.userRepository = userRepository;
//        this.categoryRepository = categoryRepository;
//        this.emailService = emailService;
//    }
//
//    @GetMapping("/ads")
//    public String index(Model model) {
//        model.addAttribute("ads", adDao.findAll());
//        return "ads/index";
//    }
//
//}