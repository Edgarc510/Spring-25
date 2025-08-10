package com.eac.proxy;

import com.eac.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);

}
