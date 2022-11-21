package com.trxjster.movieratings.service;

import com.trxjster.movieratings.model.Movie;
import com.trxjster.movieratings.repository.MovieRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class MovieService {

    private MovieRepo movieRepo;

    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }

    public Movie getMovieById(Long movieId){
        return movieRepo.findById(movieId).orElseThrow(() -> new RuntimeException("Movie with id "+ movieId + " not found."));
    }

    public Movie createMovie(Movie movie){
        Movie newMovie = new Movie();
        newMovie.setDirector(movie.getDirector());
        newMovie.setLength(movie.getLength());
        newMovie.setTitle(movie.getTitle());
        newMovie.setReleaseDate(movie.getReleaseDate());
        return movieRepo.save(newMovie);
    }

}
