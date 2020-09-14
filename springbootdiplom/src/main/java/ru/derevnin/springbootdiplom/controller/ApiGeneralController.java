package ru.derevnin.springbootdiplom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.derevnin.springbootdiplom.api.response.BlogDataResponse;

@RestController
@RequestMapping("/api")
public class ApiGeneralController {

    @GetMapping("/init")
    public BlogDataResponse getBlogData() {
        return new BlogDataResponse();
    }
}
