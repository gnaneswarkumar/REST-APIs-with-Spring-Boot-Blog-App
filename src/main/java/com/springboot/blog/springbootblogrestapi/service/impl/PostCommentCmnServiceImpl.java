package com.springboot.blog.springbootblogrestapi.service.impl;

import com.springboot.blog.springbootblogrestapi.entity.Comment;
import com.springboot.blog.springbootblogrestapi.entity.Post;
import com.springboot.blog.springbootblogrestapi.exception.ResourceNotFoundException;
import com.springboot.blog.springbootblogrestapi.repository.CommentRepository;
import com.springboot.blog.springbootblogrestapi.repository.PostRepository;
import com.springboot.blog.springbootblogrestapi.service.PostCommentCmnService;
import org.springframework.stereotype.Service;

@Service
public class PostCommentCmnServiceImpl implements PostCommentCmnService {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public PostCommentCmnServiceImpl(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public Post findByPostIdOrFail(long id) {
        return postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
    }

    @Override
    public Comment findByCommentIdOrFail(long id) {
        return commentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Comment", "id", id));
    }
}
