package com.omidmohebbise.hibernatepractices.practice1.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "posts", schema = "practice1")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private PostDetail postDetail;


}
