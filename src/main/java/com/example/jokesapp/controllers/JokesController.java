package com.example.jokesapp.controllers;

import com.example.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jokes")
public class JokesController {
    JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getRandomJoke(Model model){
        String joke=jokeService.getJoke();
        model.addAttribute("joke",joke);
        return "joke";
    }
}
