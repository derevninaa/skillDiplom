package ru.derevnin.springbootdiplom.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.PostRepository;
import ru.derevnin.springbootdiplom.service.PostService;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
