package com.more.b2bridge.review_module.server;

import com.more.b2bridge.review_module.dto.ReviewRequestDto;
import com.more.b2bridge.review_module.dto.ReviewResponseDto;
import com.more.b2bridge.review_module.mapper.ReviewMapper;
import com.more.b2bridge.review_module.model.Review;
import com.more.b2bridge.review_module.repo.ReviewRepo;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    private final ReviewRepo reviewRepo;
    private final ReviewMapper reviewMapper;

    public ReviewService(ReviewRepo reviewRepo, ReviewMapper reviewMapper) {
        this.reviewRepo = reviewRepo;
        this.reviewMapper = reviewMapper;
    }

    public ReviewResponseDto addReview(ReviewRequestDto dto) {
        Review review = reviewMapper.toEntity(dto);
        review.setReviewDate(LocalDateTime.now());
        Review saved = reviewRepo.save(review);
        return reviewMapper.toDto(saved);
    }

    public List<ReviewResponseDto> getReviewsByProduct(Long productId) {
        return reviewRepo.findByProductId(productId)
                .stream()
                .map(reviewMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<ReviewResponseDto> getReviewsByCustomer(Long customerId) {
        return reviewRepo.findByCustomerId(customerId)
                .stream()
                .map(reviewMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<ReviewResponseDto> getAllReviews() {
        return reviewRepo.findAll()
                .stream()
                .map(reviewMapper::toDto)
                .collect(Collectors.toList());
    }

    public void deleteReview(Long id) {
        reviewRepo.deleteById(id);
    }
}

