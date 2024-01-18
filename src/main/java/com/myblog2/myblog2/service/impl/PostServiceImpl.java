package com.myblog2.myblog2.service.impl;

import com.myblog2.myblog2.entity.Post;
import com.myblog2.myblog2.exception.ResourceNotFoundException;
import com.myblog2.myblog2.payload.PostDto;
import com.myblog2.myblog2.repository.PostRepository;
import com.myblog2.myblog2.service.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapToEntity(postDto);
        Post savePost = postRepository.save(post);

        PostDto dto = mapToDto(savePost);
        return dto;
    }
    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with id: " + id)
        );
        PostDto dto = mapToDto(post);
        return dto;
    }
    @Override
    public List<PostDto> getAllPost(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Post> pagePost = postRepository.findAll(pageable);
        pagePost.getContent()
        List<PostDto> postDtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());
        return postDtos;
    }
    PostDto mapToDto(Post post){
        PostDto dto= new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }
   Post  mapToEntity(PostDto postDto){
       Post post= new Post();
       post.setId(postDto.getId());
       post.setTitle(postDto.getTitle());
       post.setDescription(postDto.getDescription());
       post.setContent(postDto.getDescription());
        return post;
    }
}
