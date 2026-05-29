package com.lgcns.jpadsl.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @GetMapping()
    public List<PostDTO> getList() {
        List<PostDTO> posts = new ArrayList<>();
        posts.add(new PostDTO(1L, "title", "hong", "contents..."));
        return posts;
    }

    @GetMapping("foldername")
    public String getFolderName() {
        return "게시판";
    }
}
