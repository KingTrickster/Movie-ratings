package com.trxjster.movieratings.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity @Data
public class Movie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;
    private int length;
    private Date releaseDate;
    private float averageRating = 0.0f;

    @OneToMany
    @JsonManagedReference
    private List<Comment> comments;

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}
