package com.lgcns.jpadsl.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Post {
    private Long id;
    private String title;
    private String writer;
    private String contents;
}
