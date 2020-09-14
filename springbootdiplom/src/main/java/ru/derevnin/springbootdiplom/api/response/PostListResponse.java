package ru.derevnin.springbootdiplom.api.response;


import java.util.List;
import ru.derevnin.springbootdiplom.api.DTO.AbstractDTO;

public class PostListResponse<T extends AbstractDTO>{

    private int count;
    private List<T> posts;

}
