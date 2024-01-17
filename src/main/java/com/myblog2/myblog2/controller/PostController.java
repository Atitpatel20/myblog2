package com.myblog2.myblog2.controller;

import com.myblog2.myblog2.payload.PostDto;
import com.myblog2.myblog2.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @GetMapping("/persnolize")
    public ResponseEntity<PostDto>getPostById(@RequestParam long id){
        PostDto dto = postService.getPostById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @GetMapping
    public List<PostDto> getAllPost(){
        List<PostDto> postDtos= postService.getAllPost();
        return postDtos;
    }
}
