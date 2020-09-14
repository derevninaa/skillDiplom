package ru.derevnin.springbootdiplom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.PostVoteRepository;

@Service
public class PostVoteService {

    private final PostVoteRepository postVoteRepository;

    @Autowired
    public PostVoteService(
        PostVoteRepository postVoteRepository) {
        this.postVoteRepository = postVoteRepository;
    }
}
