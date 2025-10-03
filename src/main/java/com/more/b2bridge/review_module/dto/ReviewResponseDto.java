package com.more.b2bridge.review_module.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
//то что возвращаем наружу
public class ReviewResponseDto {
    private long id;
    private long productId;
    private long customerId;
    private int rating;
    private String comment;
    private LocalDateTime reviewDate;
}

