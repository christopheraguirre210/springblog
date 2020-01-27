package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add")
    @ResponseBody
    public String add(){
        return "Give me numbers to add";
    }

    @GetMapping("/add/{first}")
    @ResponseBody
    public String first(@PathVariable int first){
        return "number " + first;
    }

    @GetMapping("/add/{first}/and")
    @ResponseBody
    public String second(@PathVariable int first){
        return "give me another number please";
    }

    @GetMapping("/add/{first}/and/{second}")
    @ResponseBody
    public String total(@PathVariable int first, @PathVariable int second){
        return "the total of " + first +  " plus " + second + " is:" + (first + second);

    }


}
