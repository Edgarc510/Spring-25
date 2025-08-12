package com.eac.repository;

import com.eac.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
