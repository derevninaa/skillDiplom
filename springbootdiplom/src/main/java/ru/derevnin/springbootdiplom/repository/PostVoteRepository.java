package ru.derevnin.springbootdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.derevnin.springbootdiplom.model.PostVote;

@Repository
public interface PostVoteRepository extends CrudRepository<PostVote, Integer> {

}
