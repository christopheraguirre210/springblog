package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String dice(){

        return "roll-dice";
    }

    @GetMapping("/roll-dice/{num}")
    public String guessTest(@PathVariable int num, Model model){

        int diceRoll = new Random().nextInt(6) + 1;
        model.addAttribute("diceRoll", diceRoll);

        int guess = num;
        model.addAttribute("guess", guess);


        String result;

        if(num == diceRoll){
            result = "right";
        }else{
            result = "wrong";
        }

        model.addAttribute("result", result);

        return "dice-results";

    }
}
