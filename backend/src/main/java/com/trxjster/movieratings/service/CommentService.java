package com.trxjster.movieratings.service;

import com.trxjster.movieratings.model.Comment;
import com.trxjster.movieratings.repository.CommentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @AllArgsConstructor
public class CommentService {

    private CommentRepo commentRepo;

    public List<Comment> getAllCommentsByMovieId(Long movieId){
        return commentRepo.findAllByMovieId(movieId);
    }


}
