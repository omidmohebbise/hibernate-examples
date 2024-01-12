package com.omidmohebbise.dao.impl;

import com.omidmohebbise.dao.PostDao;
import com.omidmohebbise.model.Post;
import com.omidmohebbise.model.repository.PostJpaRepository;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

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

    @Transactional(readOnly = true)
    @Override
    public Stream<Post> streamAllPost() {
         return repository.streamAll();
    }
}
