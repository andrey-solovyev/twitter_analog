package com.crowtor.backend.data.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TwittFeedDto {
    private Long id;
    private String textTwit;
    private boolean isPremium;
    private int amountLikes;
    private int amountDisLikes;
    private LocalDateTime created;
}
