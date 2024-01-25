package com.myblog2.myblog2.repository;

import com.myblog2.myblog2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
