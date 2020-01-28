package com.codeup.springblog.Controllers;

import com.codeup.springblog.Models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String postsIndex(Model model){
        ArrayList<Post> postList = new ArrayList<>();
        postList.add(new Post("title 2", "Description 2", 2));
        postList.add(new Post("title 3", "Description 3", 3));

        model.addAttribute("post", postList);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model){
        Post post1 = new Post("Title 1", "Description 1", id);
        model.addAttribute("title", post1.getTitle());
        model.addAttribute("body", post1.getBody());
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPage(){
        return "This is where you will be able to create a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String create(){
        return "This is where you would actually create a new post";
    }
}
