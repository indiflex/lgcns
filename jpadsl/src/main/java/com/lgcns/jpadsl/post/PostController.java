package com.lgcns.jpadsl.post;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService service;

    @GetMapping()
    public ResponseEntity<List<PostDTO>> getList() {
        return ResponseEntity.ok(service.getPosts());
    }

    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody @Validated(PostSaveDTO.OnCreate.class) PostSaveDTO dto) {
        System.out.println("dto = " + dto);
        return ResponseEntity.ok(service.createPost(dto));
    }

    @GetMapping("/{postid}")
    public ResponseEntity<PostDTO> getPost(@PathVariable Long postid) {
        return ResponseEntity.ok(service.getPost(postid));
    }

    @PutMapping("/{postid}")
    public ResponseEntity<PostDTO> editPost(@PathVariable Long postid, @RequestBody @Validated(PostSaveDTO.OnUpdate.class) PostSaveDTO dto) {
        dto.setId(postid);
        return ResponseEntity.ok(service.editPost(dto));
    }

    @DeleteMapping("{postid}")
    public ResponseEntity<Void> removePost(@PathVariable Long postid) {
        service.removePost(postid);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("foldername")
    public ResponseEntity<String> getFolderName() {
        return ResponseEntity.ok("게시판");
    }
}
