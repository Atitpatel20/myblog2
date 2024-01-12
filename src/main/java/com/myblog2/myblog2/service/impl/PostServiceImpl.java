package com.myblog2.myblog2.service.impl;

import com.myblog2.myblog2.entity.Post;
import com.myblog2.myblog2.exception.ResourceNotFoundException;
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
    public PostDto createPost(PostDto postDto) {
        Post post= new Post();
        post.setTittle(postDto.getTittle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savePost = postRepository.save(post);

        PostDto dto= new PostDto();
        dto.setTittle(savePost.getTittle());
        dto.setDescription(savePost.getDescription());
        dto.setContent(savePost.getContent());
        return dto;
    }
    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with id: " + id)
        );
        PostDto dto= new PostDto();
        dto.setId(post.getId());
        dto.setTittle(post.getTittle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }
}
