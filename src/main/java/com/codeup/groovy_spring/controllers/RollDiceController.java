package com.codeup.groovy_spring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String rollIntro() {
        return "roll-dice";
    } //go find the roll-dice View in templates folder


    @PostMapping("/roll-dice/n")
    public String roll(@RequestParam(name = "x")@PathVariable String x, Model model) {
        int random = (int) Math.floor(Math.random() * 6) + 1;
        boolean userGuess = false;
        model.addAttribute("x", x);
        model.addAttribute("random", random);

        if(x.equals(Integer.toString(random))) {
            userGuess = true;
        }
        model.addAttribute("userGuess", userGuess);
        return "roll-dice";
    }



}