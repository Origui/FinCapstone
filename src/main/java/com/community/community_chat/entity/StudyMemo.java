package com.community.community_chat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class StudyMemo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memo_id")
    private Long memoId;

    private Long summaryId;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String memoContent;

    private String userId;
    private LocalDateTime createdAt = LocalDateTime.now();
}
