package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeimosDDayController {


    @GetMapping("/deimos/{days}")

    public String DevDay(@PathVariable String days, Model model){
        model.addAttribute("days", days);
        return "deimos";
    }

}
