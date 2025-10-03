package com.more.b2bridge.review_module.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
//то что приходит от клиента при создании отзыва
public class ReviewRequestDto {
    private long productId;
    private long customerId;
    private int rating;
    private String comment;
}

