package com.community.community_chat.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class SummaryNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(columnDefinition = "CLOB")
    private String summary;

    private int pageNumber;
    private String userId;
    private LocalDateTime cratedAt = LocalDateTime.now();
}
