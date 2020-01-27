package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String landing(){
        return "This posts the index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String singlePost(@PathVariable String id){
        return "view an individual post from  " + id;
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
