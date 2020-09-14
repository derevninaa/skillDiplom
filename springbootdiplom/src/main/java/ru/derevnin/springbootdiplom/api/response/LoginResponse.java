package ru.derevnin.springbootdiplom.api.response;


import ru.derevnin.springbootdiplom.api.DTO.AbstractDTO;

public class LoginResponse <T extends AbstractDTO>{

    private boolean result;
    private T user;

}
