package com.yumn.quiz_service.dto;

import lombok.Data;

@Data
public class QuizDto {
    private String categoryName;
    private Integer numQuestion;
    private String title;
}
