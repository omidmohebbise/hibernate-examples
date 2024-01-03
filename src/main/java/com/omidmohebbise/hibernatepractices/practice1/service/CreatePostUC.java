package com.omidmohebbise.hibernatepractices.practice1.service;

import com.omidmohebbise.hibernatepractices.practice1.model.Post;
import com.omidmohebbise.hibernatepractices.practice1.model.PostDetail;
import com.omidmohebbise.hibernatepractices.practice1.repository.PostJpaRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePostUC implements CommandLineRunner {
    private final PostJpaRepository repository;

    @Override
    public void run(String... args)  {

        // Create a new Post and DetailPost
        Post post = new Post();
        post.setTitle("Sample Post");

        PostDetail postDetail = new PostDetail();
        postDetail.setDescription("This is the description of the post");

        postDetail.setPost(post);
        post.setPostDetail(postDetail);

        repository.save(post);
    }
}
