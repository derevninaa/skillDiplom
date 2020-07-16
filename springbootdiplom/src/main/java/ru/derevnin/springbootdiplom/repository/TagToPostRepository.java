package ru.derevnin.springbootdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.derevnin.springbootdiplom.model.TagToPost;

@Repository
public interface TagToPostRepository extends CrudRepository<TagToPost, Integer> {

}
