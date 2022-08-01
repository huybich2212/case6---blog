package com.example.blogcase6.model;

import javax.persistence.*;

@Entity
@Table(name = "post_lable")
public class Post_Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Label label;

    public Post_Label() {
    }

    public Post_Label(Long id, Post post, Label label) {
        this.id = id;
        this.post = post;
        this.label = label;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
