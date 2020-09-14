package ru.derevnin.springbootdiplom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.derevnin.springbootdiplom.repository.CaptchaCodeRepository;

@Service
public class CaptchaCodeService {

    private final CaptchaCodeRepository captchaCodeRepository;

    @Autowired
    public CaptchaCodeService(
        CaptchaCodeRepository captchaCodeRepository) {
        this.captchaCodeRepository = captchaCodeRepository;
    }
}
