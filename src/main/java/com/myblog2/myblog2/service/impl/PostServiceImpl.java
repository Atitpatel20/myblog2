package com.myblog2.myblog2.service.impl;

import com.myblog2.myblog2.entity.Post;
import com.myblog2.myblog2.payload.PostDto;
import com.myblog2.myblog2.repository.PostRepository;
import com.myblog2.myblog2.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createDto(PostDto postDto) {
        Post posts= new Post();
        posts.setTittle(postDto.getTittle());
        posts.setDescription(postDto.getDescription());
        posts.setContent(postDto.getContent());

        Post savedPost = postRepository.save(posts);
        PostDto dto = new PostDto();
        dto.setTittle(savedPost.getTittle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());

        return dto;
    }
}
