package com.lgcns.jpadsl.post;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostCreateDTO {
    private String title;
    private String writer;
    private String contents;
}
