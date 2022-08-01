package com.example.blogcase6.service.impl;


import com.example.blogcase6.model.Post_Label;
import com.example.blogcase6.repository.Post_LabelRps;
import com.example.blogcase6.service.Post_LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class Post_LabelServiceImpl implements Post_LabelService {

    @Autowired
    private Post_LabelRps post_LabelRps;

    @Override
    public Page<Post_Label> findAll(Pageable pageable) {
        return post_LabelRps.findAll(pageable);
    }

    @Override
    public Optional<Post_Label> findById(Long id) {
        return post_LabelRps.findById(id);
    }

    @Override
    public Iterable<Post_Label> findAll() {
        return post_LabelRps.findAll();
    }

    @Override
    public void save(Post_Label post_label) {
        post_LabelRps.save(post_label);
    }

    @Override
    public void remove(Long id) {
        post_LabelRps.deleteById(id);
    }
}
