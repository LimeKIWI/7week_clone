package com.example.week7project.dto.request;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class PostRequestDto {
    private String title;
    private Long price;
 //   private List<String> imageUrl;
    private String category;
    private String content;
}
