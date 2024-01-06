package com.omidmohebbise.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString
@Entity
@Table(name = "posts", schema = "practice_projection")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", length = Integer.MAX_VALUE)
    private String content;

    @Column(name = "publish_date")
    private Instant publishDate;

    @Column(name = "is_published")
    private Boolean isPublished;

    @Column(name = "views_count")
    private Integer viewsCount;



}