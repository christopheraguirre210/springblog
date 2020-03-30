package com.codeup.springblog.Controllers;

import com.codeup.springblog.Models.Post;
import com.codeup.springblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    //Dependency Injection
    private PostRepository postDao;

    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }


    //Show all post
    @GetMapping("/posts")
    public String index(Model model){
        model.addAttribute("posts", postDao.findAll());
        return "/posts/index";
    }

    //Show a single post
    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable Long id, Model model){
        Post post1 = new Post(id, "Title 1", "Description 1");
        model.addAttribute("post", post1);
        return "/posts/show";
    }

    //Edit individual posts
    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable long id, Model model){
        model.addAttribute("post", postDao.getOne(id));
        return "/posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@PathVariable Long id, Post post){
        postDao.save(post);
        return "redirect:/posts";
    }

    //Delete individual posts
    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable Long id){
        postDao.deleteById(id);
        return "redirect:/posts";
    }


    //Create a post
    @GetMapping("/posts/create")
    public String createForm(){
        return "/posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@RequestParam String title, @RequestParam String body, Model model){
        Post post = new Post(title, body);
        postDao.save(post);
        return "/posts/index";
    }

    @GetMapping("/posts/test")
    public String returnTestView(Model model){
        model.addAttribute("posts", postDao.findAll());
        return "/posts/test";
    }
}
