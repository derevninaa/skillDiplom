package ru.derevnin.springbootdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.derevnin.springbootdiplom.model.PostComment;

@Repository
public interface PostCommentRepository extends CrudRepository<PostComment, Integer> {

}
