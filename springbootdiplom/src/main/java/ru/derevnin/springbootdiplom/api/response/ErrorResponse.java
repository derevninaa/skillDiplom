package ru.derevnin.springbootdiplom.api.response;


import ru.derevnin.springbootdiplom.api.DTO.AbstractDTO;

public class ErrorResponse <T extends AbstractDTO>{

    private boolean result;
    private T error;

}
