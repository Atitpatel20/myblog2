package com.myblog2.myblog2.payload;

import lombok.Data;

@Data
public class CommentsDto {
    private long id;
    private String email;
    private String text;
}
