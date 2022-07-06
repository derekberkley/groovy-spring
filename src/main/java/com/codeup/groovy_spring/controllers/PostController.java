package com.codeup.groovy_spring.controllers;

import com.codeup.groovy_spring.models.Post;
import com.codeup.groovy_spring.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
class PostController {

    //TODO: Use dependency injection to use an instance of this new Posts interface.
    private PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts/index")
//    @ResponseBody
    public String postIndex(Model model) {

        //TODO: Inside the method that shows all the posts, create a new array list and add two post objects to it, then pass that list to the view.
        Post post1 = new Post("Array List Post 1", "AL-Post 1 Description");
        Post post2 = new Post("Array List Post 2", "AL-Post 2 Description");
        ArrayList<Post> postList = new ArrayList<Post>();
        postList.add(post1);
        postList.add(post2);


        model.addAttribute("posts", postDao.findAll());
        model.addAttribute("title", "All Posts");
        return "posts/index";
    }

//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String viewPost(@PathVariable long id, Model model) {
//        model.addAttribute("title", "Post Page");
//
//        //TODO: Inside the method that shows an individual post, create a new post object and pass it to the view.
//        Post post = new Post("Test Title", "Test Description");
////        model.addAttribute("post", postDao.findById(id));
////        Post post = postDao.getById(id);
////        User user = userDao.getById(post.getUser().getId());
//        model.addAttribute("postTitle", post.getTitle());
//        model.addAttribute("postBody", post.getBody());
//        model.addAttribute("postID", post.getId());
////        model.addAttribute("user", user);
//        return "posts/show";
//    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String formCreatePost() {
        return "view the form for creating a post";
    }


    //TODO: Inside the method that shows an individual post, create a new post object and pass it to the view.
    @GetMapping("/posts/show")
    @ResponseBody
    public String viewShowPage(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body, Model model) {
        model.addAttribute("title", "Post Page");

        //TODO: Inside the method that shows an individual post, create a new post object and pass it to the view.
        Post post = new Post("Test Title", "Test Description");
//        model.addAttribute("post", postDao.findById(id));
//        Post post = postDao.getById(id);
//        User user = userDao.getById(post.getUser().getId());
        model.addAttribute("postTitle", post.getTitle());
        model.addAttribute("postBody", post.getBody());
        model.addAttribute("postID", post.getId());
//        model.addAttribute("user", user);
        return "posts/show";
    }
}