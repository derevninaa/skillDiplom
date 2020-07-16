package ru.derevnin.springbootdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.derevnin.springbootdiplom.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
