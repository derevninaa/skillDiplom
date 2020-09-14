package ru.derevnin.springbootdiplom.api.response;

import java.util.List;
import ru.derevnin.springbootdiplom.api.DTO.AbstractDTO;

public class ListErrorResponse<T extends AbstractDTO>{

    private boolean result;
    private List<T> errors;

}
