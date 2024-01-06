package com.omidmohebbise.dao;

import com.omidmohebbise.model.Post;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostDao {

    List<Post> findAll();
    List<PostShortProjection> findAllWithIDAndTitle();
}
