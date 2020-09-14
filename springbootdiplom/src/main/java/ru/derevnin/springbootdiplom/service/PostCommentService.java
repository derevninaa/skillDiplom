package ru.derevnin.springbootdiplom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.PostCommentRepository;

@Service
public class PostCommentService {

    private final PostCommentRepository postCommentRepository;

    @Autowired
    public PostCommentService(
        PostCommentRepository postCommentRepository) {
        this.postCommentRepository = postCommentRepository;
    }
}
