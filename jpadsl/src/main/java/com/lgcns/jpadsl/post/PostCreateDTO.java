package com.lgcns.jpadsl.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PostCreateDTO {
    private String title;
    private String writer;
    private String contents;
}
