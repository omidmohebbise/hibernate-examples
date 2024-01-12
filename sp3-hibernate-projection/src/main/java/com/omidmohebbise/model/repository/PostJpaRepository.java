package com.omidmohebbise.model.repository;

import com.omidmohebbise.model.Post;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import java.util.List;
import java.util.stream.Stream;

import static org.hibernate.jpa.HibernateHints.HINT_FETCH_SIZE;


public interface PostJpaRepository extends JpaRepository<Post, Long> {

    @Query("select p.id as id , p.title as title from Post p")
    List<PostShortProjection> findPostsIdAndTitle();

    @Query("SELECT a FROM Post a")
    @QueryHints(value = @QueryHint(name = HINT_FETCH_SIZE,
            value = "" + Integer.MAX_VALUE))
    Stream<Post> streamAll();
}
