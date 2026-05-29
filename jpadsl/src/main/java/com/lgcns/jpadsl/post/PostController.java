package com.lgcns.jpadsl.post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService service;

    @GetMapping()
    public List<PostDTO> getList() {
//        List<PostDTO> posts = new ArrayList<>();
//        posts.add(new PostDTO(1L, "title", "hong", "contents..."));
//        return posts;
        return service.getPosts();
    }

    @PostMapping
    public void createPost(@RequestBody PostCreateDTO dto) {
        System.out.println("dto = " + dto);
        service.createPost(dto);
    }

    @GetMapping("/{postid}")
    public PostDTO getPost(@PathVariable Long postid) {
//        return new PostDTO(postid, "title", "hong", "contents...");
        return service.getPost(postid);
    }

    @GetMapping("foldername")
    public String getFolderName() {
        return "게시판";
    }
}
