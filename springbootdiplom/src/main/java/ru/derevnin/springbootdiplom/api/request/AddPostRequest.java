package ru.derevnin.springbootdiplom.api.request;


import java.util.List;
import ru.derevnin.springbootdiplom.api.DTO.TagDTO;

public class AddPostRequest {

    private long timestamp;
    private boolean active;
    private String title;
    private List<TagDTO> tags;
    private String text;

}
