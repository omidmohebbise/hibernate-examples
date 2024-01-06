package com.omidmohebbise.service;

import com.omidmohebbise.dao.PostDao;
import com.omidmohebbise.model.repository.view.PostShortProjection;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService implements CommandLineRunner {

    private final PostDao postDao;

    public void printAllPost(){
        postDao.findAll().forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        postDao.findAllWithIDAndTitle().forEach(PostShortProjection::println);
    }
}
