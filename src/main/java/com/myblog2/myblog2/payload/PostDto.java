package com.myblog2.myblog2.payload;

import lombok.Data;

@Data
public class PostDto {
    private long id;
    private String description;
    private String tittle;
    private String content;
}
