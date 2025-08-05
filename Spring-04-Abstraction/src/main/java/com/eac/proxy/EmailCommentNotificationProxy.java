package com.eac.proxy;

import com.eac.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for " + comment.getText());
    }
}
