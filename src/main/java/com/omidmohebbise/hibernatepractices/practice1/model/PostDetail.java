package com.omidmohebbise.hibernatepractices.practice1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "post_details", schema = "practice1")
@Data
public class PostDetail {
    @Id
    @Column(name = "post_id")
    private Long id;

    private String description;

    @OneToOne
    @MapsId
    private Post post;


}
