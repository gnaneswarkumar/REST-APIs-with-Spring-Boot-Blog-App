package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.entity.Comment;
import com.springboot.blog.springbootblogrestapi.entity.Post;

public interface PostCommentCmnService {
    Post findByPostIdOrFail(long id);

    Comment findByCommentIdOrFail(long id);
}
