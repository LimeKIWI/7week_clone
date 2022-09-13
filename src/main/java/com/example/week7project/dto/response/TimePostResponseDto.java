package com.example.week7project.dto.response;

import com.example.week7project.domain.ImageFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimePostResponseDto {
    private Long id;
    private double temperature;
    private String title;
    private String status;
    private String category;
    private String nickname;
    private String address;
    private List<ImageFile> imgUrl;
    private String time;
    private long price;
    private String content;
    private int numOfChat;
    private int numOfWish;
    private int numOfWatch;
}
