package com.example.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class NorrisRandomJokesService implements JokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public NorrisRandomJokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {

        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
