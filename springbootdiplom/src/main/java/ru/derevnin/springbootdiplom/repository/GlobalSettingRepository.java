package ru.derevnin.springbootdiplom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.derevnin.springbootdiplom.model.GlobalSetting;

@Repository
public interface GlobalSettingRepository extends CrudRepository<GlobalSetting, Integer> {

}
