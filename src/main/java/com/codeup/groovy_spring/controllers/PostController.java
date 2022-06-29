package com.codeup.groovy_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String indexPage() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPostPage(@PathVariable int id) {
        return "view an individual post for " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String formCreatePost() {
        return "view the form for creating a post";
    }

//    @PostMapping("/posts/create")
//    public String createPost(@RequestBody Post post) {
//        return "create a new post";
//    }

}