package com.example.blogcase6.repository;

import com.example.blogcase6.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "SELECT * FORM post WHERE id = ?", nativeQuery = true)
    Page<Post> findAllById( Pageable pageable);
    Page<Post> findAllByLabel_Id(Long id, Pageable pageable);
}

