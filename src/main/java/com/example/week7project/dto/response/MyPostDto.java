package com.example.week7project.dto.response;

import com.example.week7project.domain.ImageFile;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class MyPostDto {
    private Long id;
    private String title;
    private List<ImageFile> imgUrl;
    private String status;
    private Long price;
}
