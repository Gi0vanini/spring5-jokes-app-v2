package com.ChuckJokes.ChuckJokes.controllers;

import com.ChuckJokes.ChuckJokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.sayJoke());

        return "joke/index";
    }
}
