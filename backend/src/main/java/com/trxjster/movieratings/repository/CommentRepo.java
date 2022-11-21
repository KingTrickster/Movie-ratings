package com.trxjster.movieratings.repository;

import com.trxjster.movieratings.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, String> {
    public List<Comment> findAllByMovieId(Long movieId);
}
