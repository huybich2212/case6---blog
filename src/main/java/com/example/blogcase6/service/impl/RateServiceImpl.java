package com.example.blogcase6.service.impl;


import com.example.blogcase6.model.Rate;
import com.example.blogcase6.repository.RateRepository;
import com.example.blogcase6.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class RateServiceImpl implements RateService {

    @Autowired
    private RateRepository rateRepository;


    @Override
    public Page<Rate> findAll(Pageable pageable) {
        return rateRepository.findAll(pageable);
    }

    @Override
    public Optional<Rate> findById(Long id) {
        return rateRepository.findById(id);
    }

    @Override
    public Iterable<Rate> findAll() {
        return rateRepository.findAll();
    }

    @Override
    public void save(Rate rate) {
        rateRepository.save(rate);
    }

    @Override
    public void remove(Long id) {
        rateRepository.deleteById(id);
    }
}
