package ru.derevnin.springbootdiplom.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.CaptchaCodeRepository;
import ru.derevnin.springbootdiplom.service.CaptchaCodeService;

@Service
public class CaptchaCodeServiceImpl implements CaptchaCodeService {

    private final CaptchaCodeRepository captchaCodeRepository;

    @Autowired
    public CaptchaCodeServiceImpl(
        CaptchaCodeRepository captchaCodeRepository) {
        this.captchaCodeRepository = captchaCodeRepository;
    }
}
