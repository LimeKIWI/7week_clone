package com.example.week7project.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MyPostDto {
    private Long id;
    private String title;
    private String imgUrl;
    private String status;
    private Long price;
    private String address;
    private String time;
    private int numOfChatroom;
    private int numOfWish;
}
