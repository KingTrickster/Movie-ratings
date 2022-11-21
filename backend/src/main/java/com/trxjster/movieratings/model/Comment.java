package com.trxjster.movieratings.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity @Data
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String bodyText;
    private float rating;
    private Date publishedDate;

    @ManyToOne
    @JsonBackReference
    private Movie movie;
}
