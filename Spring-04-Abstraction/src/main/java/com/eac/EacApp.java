package com.eac;

import com.eac.config.ProjectConfig;
import com.eac.model.Comment;
import com.eac.repository.CommentRepository;
import com.eac.repository.DBCommentRepository;
import com.eac.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EacApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");


        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);


    }


}
