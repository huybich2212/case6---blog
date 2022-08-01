package com.example.blogcase6.model;

import javax.persistence.*;

@Entity
@Table(name = "rate")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private int level;

    public Rate() {
    }

    public Rate(Long id, int level) {
        this.id = id;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
