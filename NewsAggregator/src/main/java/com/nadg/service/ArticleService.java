package com.nadg.service;

import com.nadg.entity.Article;
import com.nadg.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public List<Article> getArticlesBySource(String source) {
        return articleRepository.findBySource(source);
    }

    public List<Article> searchArticles(String keyword) {
        return articleRepository.findByTitleContaining(keyword);
    }
}
