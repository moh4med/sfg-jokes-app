package com.example.jokesapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import java.util.ArrayList;
import java.util.Random;

@Primary
@Service
public class NorrisRandomJokesService implements JokeService{
    @Override
    public String getJoke() {

        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
