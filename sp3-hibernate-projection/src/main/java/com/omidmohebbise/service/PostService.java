package com.omidmohebbise.service;

import com.omidmohebbise.dao.PostDao;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService implements CommandLineRunner {

    private final PostDao postDao;

    public void printAllPost(){
        postDao.findAll().forEach(System.out::println);
    }

    @Override
    @Transactional(readOnly = true)
    public void run(String... args) throws Exception {
        //postDao.findAllWithIDAndTitle().forEach(PostShortProjection::println);

        postDao.streamAllPost().forEach(post -> {
            System.out.println(post.getTitle());
        });


    }



}
