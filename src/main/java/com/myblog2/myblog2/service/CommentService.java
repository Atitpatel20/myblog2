package com.myblog2.myblog2.service;

import com.myblog2.myblog2.payload.CommentsDto;

public interface CommentService {
    CommentsDto  createComment(CommentsDto commentsDto, long postId);
}
