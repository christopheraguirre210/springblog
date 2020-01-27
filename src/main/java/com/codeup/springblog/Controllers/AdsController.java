package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdsController {

    @GetMapping("/ads")
    public String adsPage(){
        return "index";
    }
}
