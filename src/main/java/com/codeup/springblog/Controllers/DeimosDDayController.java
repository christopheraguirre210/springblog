package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeimosDDayController {

    @GetMapping("/deimos")
    @ResponseBody
    public String DevDay(){
        return "31 days until dev day";
    }

    @GetMapping("/deimos/{day}")
    @ResponseBody
    public String DevDay(@PathVariable String day){
        return "There are " + day + " days until graduation";
    }
}
