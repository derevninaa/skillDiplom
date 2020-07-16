package ru.derevnin.springbootdiplom.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.PostVoteRepository;
import ru.derevnin.springbootdiplom.service.PostVoteService;

@Service
public class PostVoteServiceImpl implements PostVoteService {

    private final PostVoteRepository postVoteRepository;

    @Autowired
    public PostVoteServiceImpl(
        PostVoteRepository postVoteRepository) {
        this.postVoteRepository = postVoteRepository;
    }
}
