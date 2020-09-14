package ru.derevnin.springbootdiplom.api.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogDataResponse {

    private String title;
    private String subTitle;
    private String phone;
    private String email;
    private String copyright;
    private String copyrightFrom;

}
