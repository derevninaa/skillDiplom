package ru.derevnin.springbootdiplom.api.DTO;


public class PostDTO <T extends AbstractDTO> extends AbstractDTO{

    private int id;
    private long timestamp;
    private T user;
    private String title;
    private String announce;
    private int likeCount;
    private int dislikeCount;
    private int commentCount;
    private int viewCount;

}
