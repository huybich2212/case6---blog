package com.example.blogcase6.repository;

import com.example.blogcase6.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}

