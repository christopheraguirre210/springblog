package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StringTransformController {

    @GetMapping("/string/reverse/{string}")
    @ResponseBody
    public String reversed(@PathVariable String string){
        return new StringBuilder(string).reverse().toString();
    }

    @GetMapping("/string/uppercase/{string}")
    @ResponseBody
    public String upper(@PathVariable String string){
        return string.toUpperCase();
    }

    @GetMapping("/string/both/{string}")
    @ResponseBody
    public String both(@PathVariable String string){
        return reversed(string).toUpperCase();
    }
}
