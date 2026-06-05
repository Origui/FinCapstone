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
    @Column(name = "summary_id")
    private Long summaryId;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String summary;

    private int pageNumber;
    private String userId;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String visualPagesJson;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String visualSummary;

    private LocalDateTime cratedAt = LocalDateTime.now();
}
