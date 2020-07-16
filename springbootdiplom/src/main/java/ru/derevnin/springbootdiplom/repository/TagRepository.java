package ru.derevnin.springbootdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.derevnin.springbootdiplom.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {

}
