package com.myblog2.myblog2.controller;

import com.myblog2.myblog2.payload.CommentsDto;
import com.myblog2.myblog2.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {
    private CommentService commentService;

    public CommentsController(CommentService commentService) {
        this.commentService = commentService;
    }

    // http://localhost:8080/api/comments?postId=1
    @PostMapping
    public ResponseEntity<CommentsDto> createComment(
            @RequestBody CommentsDto commentsDto,
            @RequestParam long postId
    ) {
        CommentsDto dtos = commentService.createComment(commentsDto, postId);
        return new ResponseEntity<>(dtos, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRecordById(@PathVariable long id) {
        commentService.deleteRecordById(id);
        return new ResponseEntity<>("Record is Deleted", HttpStatus.OK);
    }
// http://localhost:8080/api/comments/2
    @PutMapping("/{id}/post/{postId}")
    public ResponseEntity<CommentsDto> updateComment(@PathVariable long id, @RequestBody CommentsDto commentsDto,@PathVariable long postId) {
        CommentsDto dto = commentService.updateComment(id, commentsDto,postId);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
