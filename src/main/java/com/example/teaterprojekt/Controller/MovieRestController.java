package com.example.teaterprojekt.Controller;


import com.example.teaterprojekt.Model.Movie;
import com.example.teaterprojekt.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.awt.*;
import java.util.Optional;

@RestController
@CrossOrigin
public class MovieRestController {

    // Det er for at den tilkyntter automatisk
    @Autowired
    MovieRepository movieRepository;

    // Her vil jeg gerne hente alle film

    @GetMapping("/MovieList")
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie postRegion(@RequestBody Movie movie) {
        System.out.println(movie);
        return movieRepository.save(movie);
    }
/*
    @PutMapping("/Movie/{id}")
    public ResponseEntity<Movie> updateCount(@PathVariable String id, @RequestBody Movie kommune) {
        Optional<Movie> optKommune = movieRepository.findById(id);
        if (optKommune.isPresent()) {
            movieRepository.save(kommune);
            return new ResponseEntity<>(movie,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
*/



}
