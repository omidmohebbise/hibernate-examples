package com.omidmohebbise.dao;

import com.omidmohebbise.model.Post;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;


public interface PostDao {

    List<Post> findAll();
    List<PostShortProjection> findAllWithIDAndTitle();

    @Transactional(readOnly = true)
    Stream<Post> streamAllPost();
}
