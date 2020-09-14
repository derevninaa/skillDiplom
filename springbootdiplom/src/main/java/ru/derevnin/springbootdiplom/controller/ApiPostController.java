package ru.derevnin.springbootdiplom.controller;


import java.time.Instant;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.derevnin.springbootdiplom.api.DTO.AbstractDTO;
import ru.derevnin.springbootdiplom.api.request.AddPostCommentRequest;
import ru.derevnin.springbootdiplom.api.request.AddPostRequest;
import ru.derevnin.springbootdiplom.api.request.ModerationPostRequest;
import ru.derevnin.springbootdiplom.api.response.BooleanResultResponse;
import ru.derevnin.springbootdiplom.api.response.IdResponse;
import ru.derevnin.springbootdiplom.api.response.PostListResponse;
import ru.derevnin.springbootdiplom.api.response.PostResponse;
import ru.derevnin.springbootdiplom.api.response.TagListResponse;
import ru.derevnin.springbootdiplom.model.ModerationStatus;

@RestController
@RequestMapping("/api")
public class ApiPostController {

    @GetMapping
    public PostListResponse<AbstractDTO> getPostList(
        @RequestParam int offset,
        @RequestParam int limit,
        @RequestParam Sort mode,
        @RequestParam boolean recent,
        @RequestParam boolean popular,
        @RequestParam boolean best,
        @RequestParam boolean early) {

        return new PostListResponse<>();
    }

    @GetMapping("/post/search")
    public PostListResponse<AbstractDTO> searchPost(
        @RequestParam int offset,
        @RequestParam int limit,
        @RequestParam String query) {

        return new PostListResponse<>();
    }

    @GetMapping("/post/byDate")
    public PostListResponse<AbstractDTO> getPostListByDate(
        @RequestParam int offset,
        @RequestParam int limit,
        @RequestParam Instant date) {

        return new PostListResponse<>();
    }

    @GetMapping("/post/byTag")
    public PostListResponse<AbstractDTO> getPostListByTag(
        @RequestParam int offset,
        @RequestParam int limit,
        @RequestParam String tag) {

        return new PostListResponse<>();
    }

    @GetMapping("/post/moderation")
    public PostListResponse<AbstractDTO> getPostListOnModeration(
        @RequestParam int offset,
        @RequestParam int limit,
        @RequestParam ModerationStatus status) {

        return new PostListResponse<>();
    }

    @GetMapping("/post/my")
    public PostListResponse<AbstractDTO> getMyPostList(
        @RequestParam int offset,
        @RequestParam int limit,
        @RequestParam ModerationStatus status,
        @RequestParam boolean inactive,
        @RequestParam boolean pending,
        @RequestParam boolean decline,
        @RequestParam boolean published) {

        return new PostListResponse<>();
    }

    @GetMapping("/post/{id}")
    public PostResponse<AbstractDTO> getPost(@PathVariable(value = "id") int id) {
        return new PostResponse<>();
    }

    @PostMapping("/post")
    public BooleanResultResponse addPost(AddPostRequest addPostRequest) {

        return new BooleanResultResponse();
    }

    @PutMapping("/post/{id}")
    public BooleanResultResponse editPost(AddPostRequest addPostRequest) {

        return new BooleanResultResponse();
    }

    @PostMapping("/comment")
    public IdResponse addPostComment(AddPostCommentRequest addPostCommentRequest) {
        return new IdResponse();
    }

    @GetMapping("/tag")
    public TagListResponse getTagList(@RequestParam String query) {
        return  new TagListResponse();
    }

    @PostMapping("/moderation")
    public BooleanResultResponse moderationPost(ModerationPostRequest moderationPostRequest) {
        return new BooleanResultResponse();
    }

}
