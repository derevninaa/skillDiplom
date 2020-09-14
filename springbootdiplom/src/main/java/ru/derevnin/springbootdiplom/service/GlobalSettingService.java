package ru.derevnin.springbootdiplom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.GlobalSettingRepository;

@Service
public class GlobalSettingService {

    private final GlobalSettingRepository globalSettingRepository;

    @Autowired
    public GlobalSettingService(
        GlobalSettingRepository globalSettingRepository) {
        this.globalSettingRepository = globalSettingRepository;
    }
}
