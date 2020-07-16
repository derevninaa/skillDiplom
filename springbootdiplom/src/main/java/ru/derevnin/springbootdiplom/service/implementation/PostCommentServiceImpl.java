package ru.derevnin.springbootdiplom.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.PostCommentRepository;
import ru.derevnin.springbootdiplom.service.PostCommentService;

@Service
public class PostCommentServiceImpl implements PostCommentService {

    private final PostCommentRepository postCommentRepository;

    @Autowired
    public PostCommentServiceImpl(
        PostCommentRepository postCommentRepository) {
        this.postCommentRepository = postCommentRepository;
    }
}
