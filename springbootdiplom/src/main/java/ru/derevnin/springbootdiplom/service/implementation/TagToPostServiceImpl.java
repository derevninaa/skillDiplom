package ru.derevnin.springbootdiplom.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.TagToPostRepository;
import ru.derevnin.springbootdiplom.service.TagToPostService;

@Service
public class TagToPostServiceImpl implements TagToPostService {

    private final TagToPostRepository tagToPostRepository;

    @Autowired
    public TagToPostServiceImpl(
        TagToPostRepository tagToPostRepository) {
        this.tagToPostRepository = tagToPostRepository;
    }
}
