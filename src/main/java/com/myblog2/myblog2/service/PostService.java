package com.myblog2.myblog2.service;

import com.myblog2.myblog2.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getAllPost();
}
