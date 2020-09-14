package ru.derevnin.springbootdiplom.api.DTO;

public class CommentDTO <T extends AbstractDTO>{

    private int id;
    private long timestamp;
    private String text;
    private T user;

}
