package com.omidmohebbise.dao.impl;

import com.omidmohebbise.dao.PostDao;
import com.omidmohebbise.model.Post;
import com.omidmohebbise.model.repository.PostJpaRepository;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostDaoImpl implements PostDao {

    private final PostJpaRepository repository;

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public List<PostShortProjection> findAllWithIDAndTitle() {
        return repository.findPostsIdAndTitle();
    }
}
