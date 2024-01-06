package com.omidmohebbise.model.repository;

import com.omidmohebbise.model.Post;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PostJpaRepository extends JpaRepository<Post, Long> {

    @Query("select p.id as id , p.title as title from Post p")
    List<PostShortProjection> findPostsIdAndTitle();
}
