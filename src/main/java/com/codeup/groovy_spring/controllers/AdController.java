package com.codeup.groovy_spring.controllers;
import com.codeup.groovy_spring.models.Ad;
import com.codeup.groovy_spring.repositories.AdsRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

class AdController {

    private AdsRepository adDao; //(adsDao aka adsRepository)

    public AdController(AdsRepository adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ads", adDao.findAll());
        return "ads/index";
    }

}