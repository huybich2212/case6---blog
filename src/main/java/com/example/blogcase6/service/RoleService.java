package com.example.blogcase6.service;


import com.example.blogcase6.model.Role;

public interface RoleService {
    Iterable<Role> findAll();


    void save(Role role);


    Role findByName(String name);
}
