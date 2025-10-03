package com.more.b2bridge.review_module.controller;

import com.more.b2bridge.review_module.dto.ReviewRequestDto;
import com.more.b2bridge.review_module.dto.ReviewResponseDto;
import com.more.b2bridge.review_module.server.ReviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    // Добавить отзыв
    @PostMapping
    public ReviewResponseDto createReview(@RequestBody ReviewRequestDto dto) {
        return reviewService.addReview(dto);
    }

    // Получить все отзывы
    @GetMapping
    public List<ReviewResponseDto> getAllReviews() {
        return reviewService.getAllReviews();
    }

    // Получить отзывы по продукту
    @GetMapping("/product/{productId}")
    public List<ReviewResponseDto> getReviewsByProduct(@PathVariable Long productId) {
        return reviewService.getReviewsByProduct(productId);
    }

    // Получить отзывы по клиенту
    @GetMapping("/customer/{customerId}")
    public List<ReviewResponseDto> getReviewsByCustomer(@PathVariable Long customerId) {
        return reviewService.getReviewsByCustomer(customerId);
    }

    // Удалить отзыв
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }
}

