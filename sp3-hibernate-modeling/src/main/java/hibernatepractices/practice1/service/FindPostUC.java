package hibernatepractices.practice1.service;

import hibernatepractices.practice1.model.Post;
import hibernatepractices.practice1.model.PostDetail;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindPostUC implements CommandLineRunner {


    private final EntityManager entityManager;

    @Override
    public void run(String... args)  {
        var post = entityManager.find(Post.class, 1L);
        System.out.println("post fetched: \t" +  post.getTitle());
        var postDetail = entityManager.find(PostDetail.class, post.getId());
        System.out.println("postDetail Fetched by post id: \t" + postDetail.getDescription());

    }
}
