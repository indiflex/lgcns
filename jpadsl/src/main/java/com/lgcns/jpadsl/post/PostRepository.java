package com.lgcns.jpadsl.post;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository {
    List<Post> findAll();

    Post save(Post post);

    Post findById(Long postid);

    void deleteById(Long postid);
}
