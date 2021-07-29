package com.example.springredisprimarydatastore.controller;

import com.example.springredisprimarydatastore.model.MovieModel;
import com.example.springredisprimarydatastore.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("getmovie")
    public MovieModel getMovie(@RequestParam String key){
        return movieService.getMovie(key);
    }

    @GetMapping("getallmovies")
    public List<MovieModel> getAllMovies(){
        return movieService.getAllMovies();
    }
}
