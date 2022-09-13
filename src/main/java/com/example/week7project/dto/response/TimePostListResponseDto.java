package com.example.week7project.dto.response;

import com.example.week7project.domain.ImageFile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TimePostListResponseDto {

    private Long id;
    private String title;
    private List<ImageFile> imgUrl;
    private String time;
    private long price;
    private int numOfChat;
    private int numOfWish;
}
