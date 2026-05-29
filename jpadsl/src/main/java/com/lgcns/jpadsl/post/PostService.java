package com.lgcns.jpadsl.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;

    public List<PostDTO> getPosts() {
        List<Post> posts = repository.findAll();
        List<PostDTO> dtos = new ArrayList<>();
        for (Post post : posts) {
            dtos.add(entityToDTO(post));
        }
        return dtos;
    }

    public PostDTO createPost(PostSaveDTO dto) {
        return entityToDTO(repository.save(dtoToEntity(dto)));
    }

    public PostDTO getPost(Long postid) {
        return entityToDTO(repository.findById(postid));
    }

    public PostDTO editPost(PostSaveDTO dto) {
        return entityToDTO(repository.save(dtoToEntity(dto)));
    }

    public void removePost(Long postid) {
        repository.deleteById(postid);
    }

    private PostDTO entityToDTO(Post post) {
        return new PostDTO(post.getId(), post.getTitle(), post.getWriter(), post.getContents());
    }

    private Post dtoToEntity(PostSaveDTO dto) {
        return Post.builder()
                .title(dto.getTitle())
                .writer(dto.getWriter())
                .contents(dto.getContents())
                .build();
    }
}
