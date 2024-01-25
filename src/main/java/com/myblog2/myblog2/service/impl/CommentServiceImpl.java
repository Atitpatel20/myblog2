package com.myblog2.myblog2.service.impl;

import com.myblog2.myblog2.entity.Comment;
import com.myblog2.myblog2.entity.Post;
import com.myblog2.myblog2.exception.ResourceNotFoundException;
import com.myblog2.myblog2.payload.CommentsDto;
import com.myblog2.myblog2.repository.CommentRepository;
import com.myblog2.myblog2.repository.PostRepository;
import com.myblog2.myblog2.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentsDto createComment(CommentsDto commentsDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with id: " + postId)
        );
        Comment comment= new Comment();
        comment.setEmail(commentsDto.getEmail());
        comment.setText(commentsDto.getText());
        comment.setPost(post);

        Comment saveComments = commentRepository.save(comment);
        CommentsDto dto =  new CommentsDto();
        dto.setId(saveComments.getId());
        dto.setEmail(saveComments.getEmail());
        dto.setText(saveComments.getText());
        return dto;
    }
}
