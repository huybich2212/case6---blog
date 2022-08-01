package com.example.blogcase6.controller;


import com.example.blogcase6.model.Post;
import com.example.blogcase6.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public ResponseEntity<Iterable<Post>> showAllPost() {
        Iterable<Post> posts = postService.findAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        postService.save(post);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Post> update(@PathVariable Long id, @RequestBody Post post) {
        Optional<Post> post1 = postService.findById(id);
        if (!post1.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        post.setId(id);
        postService.save(post);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<Page<Post>> findAllById(Pageable pageable) {
        return new ResponseEntity<>(postService.findAllById(pageable), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Post> delete(@PathVariable Long id){
        postService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Post>>findById(@PathVariable Long id) {
        return new ResponseEntity<>(postService.findById(id),HttpStatus.OK);
    }

}
