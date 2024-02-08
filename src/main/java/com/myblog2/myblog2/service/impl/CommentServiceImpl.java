package com.myblog2.myblog2.service.impl;

import com.myblog2.myblog2.entity.Comment;
import com.myblog2.myblog2.entity.Post;
import com.myblog2.myblog2.exception.ResourceNotFoundException;
import com.myblog2.myblog2.payload.CommentsDto;
import com.myblog2.myblog2.repository.CommentRepository;
import com.myblog2.myblog2.repository.PostRepository;
import com.myblog2.myblog2.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    private PostRepository postRepository;
    private CommentRepository commentRepository;
    private ModelMapper modelMapper;

    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository,ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public CommentsDto createComment(CommentsDto commentsDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with id: " + postId)
        );
        Comment comment = mapToEntity(commentsDto);
//        Comment comment= new Comment();
//        comment.setEmail(commentsDto.getEmail());
//        comment.setText(commentsDto.getText());
        comment.setPost(post);

        Comment saveComments = commentRepository.save(comment);
//        CommentsDto dto = mapToDto(saveComments);
//        CommentsDto dto =  new CommentsDto();
//        dto.setId(saveComments.getId());
//        dto.setEmail(saveComments.getEmail());
//        dto.setText(saveComments.getText());
        return mapToDto(saveComments);
    }

    @Override
    public void deleteRecordById(long id) {
        commentRepository.deleteById(id);
    }
    @Override
    public CommentsDto updateComment(long id, CommentsDto commentsDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post not found with id:" + id)
        );

        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Comment not found with id:" + id)
        );
        Comment c = mapToEntity(commentsDto);
        c.setId(comment.getId());
//        comment.setEmail(commentsDto.getEmail());
//        comment.setText(commentsDto.getText());
        c.setPost(post);

        Comment saveComments = commentRepository.save(c);
//        CommentsDto dto = mapToDto(comments);
//        CommentsDto dto =  new CommentsDto();
//        dto.setId(saveComments.getId());
//        dto.setEmail(saveComments.getEmail());
//        dto.setText(saveComments.getText());
        return mapToDto(saveComments);
    }
    CommentsDto mapToDto(Comment comment){
        CommentsDto dto = modelMapper.map(comment, CommentsDto.class);
        return dto;
    }
    Comment mapToEntity(CommentsDto commentsDto){
        Comment comment = modelMapper.map(commentsDto, Comment.class);
        return comment;
    }
}
