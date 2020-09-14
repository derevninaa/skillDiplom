package ru.derevnin.springbootdiplom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derevnin.springbootdiplom.api.DTO.AbstractDTO;
import ru.derevnin.springbootdiplom.api.request.EditPasswordRequest;
import ru.derevnin.springbootdiplom.api.request.LoginRequest;
import ru.derevnin.springbootdiplom.api.request.RegistrationRequest;
import ru.derevnin.springbootdiplom.api.response.BooleanResultResponse;
import ru.derevnin.springbootdiplom.api.response.CaptchaResponse;
import ru.derevnin.springbootdiplom.api.response.LoginResponse;

@RestController
@RequestMapping("/api/auth")
public class ApiAuthController {

    @PostMapping("/login")
    public LoginResponse<AbstractDTO> login(LoginRequest loginRequest) {

        return new LoginResponse<>();
    }

    @GetMapping("/check")
    public LoginResponse<AbstractDTO> authorisationStatus() {
        return new LoginResponse<>();
    }

    @PostMapping("/restore")
    public BooleanResultResponse restorePassword(String email) {
        return new BooleanResultResponse();
    }

    @PostMapping("/password")
    public BooleanResultResponse editPassword(EditPasswordRequest editPasswordRequest) {
        return new BooleanResultResponse();
    }

    @PostMapping("/register")
    public BooleanResultResponse registration(RegistrationRequest registrationRequest) {
        return new BooleanResultResponse();
    }

    @GetMapping("/captcha")
    public CaptchaResponse getCaptcha() {
        return new CaptchaResponse();
    }

    @GetMapping("/logout")
    public BooleanResultResponse logout() {
        return new BooleanResultResponse();
    }
}
