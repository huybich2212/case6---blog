package com.example.blogcase6.service;


import com.example.blogcase6.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService extends IService<Post> {
    Page<Post> findAllById( Pageable pageable);

}

