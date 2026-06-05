package com.community.community_chat.repository;

import com.community.community_chat.entity.Post;
import com.community.community_chat.entity.PostReport;
import com.community.community_chat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostReportRepository extends JpaRepository<PostReport, Long> {
    boolean existsByPostAndUser(Post post, User user);
}