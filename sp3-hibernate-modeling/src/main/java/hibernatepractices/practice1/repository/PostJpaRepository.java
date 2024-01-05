package hibernatepractices.practice1.repository;

import hibernatepractices.practice1.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepository extends JpaRepository<Post, Long> {
}
