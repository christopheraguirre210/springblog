package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {


    @GetMapping("/add/{x}/and/{y}")
    @ResponseBody
    public String add(@PathVariable int x, @PathVariable int y){
        return "the total of " + x +  " plus " + y + " is:" + (x + y);

    }

    @GetMapping("/subtract/{first}/from/{second}")
    @ResponseBody
    public String subtract(@PathVariable int first, @PathVariable int second){
        return "the total of " + first +  " minus " + second + " is:" + (second - first);

    }

    @GetMapping("/multiply/{first}/and/{second}")
    @ResponseBody
    public String multiply(@PathVariable int first, @PathVariable int second){
        return "the total of " + first +  " times " + second + " is:" + (first * second);

    }

    @GetMapping("/divide/{first}/by/{second}")
    @ResponseBody
    public String divide(@PathVariable int first, @PathVariable int second){
        return "the total of " + first +  " divided by " + second + " is:" + (second * first);

    }


}
