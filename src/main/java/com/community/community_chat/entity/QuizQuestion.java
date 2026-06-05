package com.community.community_chat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class QuizQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long questionId;

    private Long summaryId;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String question;

    private String answer;

    private String questionType;

    private String userId;

    private LocalDateTime createdAt = LocalDateTime.now();
}
