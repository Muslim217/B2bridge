package com.more.b2bridge.review_module.mapper;

import com.more.b2bridge.review_module.dto.ReviewRequestDto;
import com.more.b2bridge.review_module.dto.ReviewResponseDto;
import com.more.b2bridge.review_module.model.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {

    public Review toEntity(ReviewRequestDto dto) {
        Review review = new Review();
        review.setProductId(dto.getProductId());
        review.setCustomerId(dto.getCustomerId());
        review.setRating(dto.getRating());
        review.setComment(dto.getComment());
        return review;
    }

    public ReviewResponseDto toDto(Review review) {
        ReviewResponseDto dto = new ReviewResponseDto();
        dto.setId(review.getId());
        dto.setProductId(review.getProductId());
        dto.setCustomerId(review.getCustomerId());
        dto.setRating(review.getRating());
        dto.setComment(review.getComment());
        dto.setReviewDate(review.getReviewDate());
        return dto;
    }
}
