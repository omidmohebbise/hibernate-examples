package org.omidmohebbise.hibernate.core.sphibernatecore.example1;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/use-entity-manager")
public class UseEntityManager {

    @PersistenceContext
    EntityManager entityManager;

    @PersistenceUnit
    EntityManagerFactory emf;

    @GetMapping
    public ResponseEntity<?> getNumberOfPosts() {
        var result = entityManager.createQuery("from Post p")
                .getResultStream().count();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/add-signal")
    @Transactional
    public ResponseEntity<?> addAPost() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();

            Post newPost = new Post();
            // Generate ID dynamically or use a strategy to avoid conflicts
            newPost.setId(System.currentTimeMillis());
            newPost.setTitle("title " + newPost.getId());
            newPost.setContent("content " +  newPost.getId());
            newPost.setIsPublished(false);

            em.persist(newPost);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace(); // Handle the exception appropriately
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred");
        } finally {
            em.close();
        }

        return ResponseEntity.ok(true);
    }
}
