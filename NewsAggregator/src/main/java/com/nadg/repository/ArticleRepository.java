package com.nadg.repository;


import com.nadg.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findBySource(String source);
    List<Article> findByTitleContaining(String keyword);
}
