package com.example.jokesapp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class RandomJokesService implements JokeService{
    private static final ArrayList<String> jokes = initJokes();

    static ArrayList<String> initJokes() {
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add("joke"+i);
        }
        return arr;
    }
    @Override
    public String getJoke() {
        Random rand=new Random();
        int idx=rand.nextInt(RandomJokesService.jokes.size());
        return RandomJokesService.jokes.get(idx);
    }
}
