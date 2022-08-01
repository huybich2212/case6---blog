package com.example.blogcase6.service.impl;


import com.example.blogcase6.model.Label;
import com.example.blogcase6.repository.LabelRepository;
import com.example.blogcase6.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelRepository labelRepository;

    @Override
    public Page<Label> findAll(Pageable pageable) {
        return labelRepository.findAll(pageable);
    }

    @Override
    public Optional<Label> findById(Long id) {
        return labelRepository.findById(id);
    }

    @Override
    public Iterable<Label> findAll() {
        return labelRepository.findAll();
    }

    @Override
    public void save(Label label) {
        labelRepository.save(label);
    }

    @Override
    public void remove(Long id) {
        labelRepository.deleteById(id);
    }
}

