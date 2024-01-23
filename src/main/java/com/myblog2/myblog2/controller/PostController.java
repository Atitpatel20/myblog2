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
    // http://localhost:8080/api/posts?pageNo=0&pageSize=3&sortBy=title&sortDir=Desc
    @GetMapping
    public List<PostDto> getAllPost(
            @RequestParam(name="pageNo",required = false,defaultValue = "0")int pageNo,
            @RequestParam(name="pageSize",required = false,defaultValue = "0")int pageSize,
            @RequestParam(name="sortBy",required = false,defaultValue = "id")String sortBy,
            @RequestParam(name="sortDir",required = false,defaultValue = "id")String sortDir
    ){
        List<PostDto> postDtos= postService.getAllPost(pageNo,pageSize,sortBy,sortDir);
        return postDtos;
    }

}
