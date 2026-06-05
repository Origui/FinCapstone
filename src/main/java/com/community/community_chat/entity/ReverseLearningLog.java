package com.community.community_chat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ReverseLearningLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reverse_id")
    private Long reverseId;

    private Long summaryId;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String reverseQuestion;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String userAnswer;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String aiFeedback;

    private String userId;
    private LocalDateTime createdAt = LocalDateTime.now();
}
