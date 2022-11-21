package com.trxjster.movieratings.api.v1;

import com.trxjster.movieratings.model.Movie;
import com.trxjster.movieratings.service.CommentService;
import com.trxjster.movieratings.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;
    private CommentService commentService;

    @GetMapping("")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/{movieId}")
    public Movie getMovieById(@RequestParam Long movieId){
        return movieService.getMovieById(movieId);
    }

    @PostMapping("")
    public Movie createMovie(@RequestBody Movie movie){
        return movieService.createMovie(movie);
    }

}
