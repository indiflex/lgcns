package com.lgcns.jpadsl.post;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class PostRepositoryImpl implements PostRepository {
    private final Post samplePost = new Post(1L, "title", "hong", "contents...");

    @Override
    public List<Post> findAll() {
        return List.of(samplePost);
    }

    @Override
    public Post save(Post post) {
        return samplePost;
    }

    @Override
    public Post findById(Long postid) {
        return samplePost;
    }

    @Override
    public void deleteById(Long postid) {

    }
}
