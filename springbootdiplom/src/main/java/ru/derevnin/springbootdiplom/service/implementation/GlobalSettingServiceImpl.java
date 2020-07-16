package ru.derevnin.springbootdiplom.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.GlobalSettingRepository;
import ru.derevnin.springbootdiplom.service.GlobalSettingService;

@Service
public class GlobalSettingServiceImpl implements GlobalSettingService {

    private final GlobalSettingRepository globalSettingRepository;

    @Autowired
    public GlobalSettingServiceImpl(
        GlobalSettingRepository globalSettingRepository) {
        this.globalSettingRepository = globalSettingRepository;
    }
}
