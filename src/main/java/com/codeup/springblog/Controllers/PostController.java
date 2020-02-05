package com.codeup.springblog.Controllers;

import com.codeup.springblog.Models.Post;
import com.codeup.springblog.Models.User;
import com.codeup.springblog.Services.EmailService;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    //Dependency Injection
    private PostRepository postDao;
    private UserRepository userDao;
    private EmailService emailService;

    public PostController(PostRepository postDao, UserRepository userDao, EmailService emailService){
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
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
        model.addAttribute("post", postDao.getOne(id));
        return "/posts/show";
    }

    //Edit individual posts
    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable long id, Model model){
        model.addAttribute("post", postDao.getOne(id));
        return "/posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post, @PathVariable Long id){
        User user = userDao.getOne(id);
        post.setUser(user);
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
    public String createPostForm(Model model){
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(loggedInUser.getUsername());
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createForm(@ModelAttribute Post post){
        User user = userDao.getOne(1L);
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }

}
