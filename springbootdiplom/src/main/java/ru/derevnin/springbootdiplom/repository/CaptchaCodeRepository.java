package ru.derevnin.springbootdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.derevnin.springbootdiplom.model.CaptchaCode;

@Repository
public interface CaptchaCodeRepository extends CrudRepository<CaptchaCode, Integer> {

}
