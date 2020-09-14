package ru.derevnin.springbootdiplom.api.response;

import java.util.List;
import ru.derevnin.springbootdiplom.api.DTO.AbstractDTO;

public class PostResponse <T extends AbstractDTO>{

    private int id;
    private long timestamp;
    private boolean active;
    private T user;
    private String title;
    private String text;
    private int likeCount;
    private int dislikeCount;
    private int viewCount;
    private List<T> comments;
    private List<T> tags;

}
