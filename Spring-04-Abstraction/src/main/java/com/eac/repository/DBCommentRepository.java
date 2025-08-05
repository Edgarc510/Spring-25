package com.eac.repository;

import com.eac.model.Comment;

public class DBCommentRepository {

    public void storeComment(Comment comment){
        System.out.println("Storing comment: " +comment.getText());
    }

}
