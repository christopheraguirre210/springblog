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

    private PostRepository postDao;

    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }


    //Show all post
    @GetMapping("/posts")
    public String index(Model model){
        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1L, "post 1 title", "post 1 body"));
        posts.add(new Post(2L, "post 2 title", "post 2 body"));
        posts.add(new Post(3L, "post 3 title", "post 3 body"));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    //Show a single post
    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable Long id, Model model){
        Post post1 = new Post(4L, "Title 1", "Description 1");
        model.addAttribute("post", post1);
        return "posts/show";
    }

    //Create a post
    @GetMapping("/posts/create")
    public String createForm(){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@RequestParam String title, @RequestParam String body, Model model){
        Post post = new Post(title, body);
        postDao.save(post);
        return "/posts/index";
    }
}
