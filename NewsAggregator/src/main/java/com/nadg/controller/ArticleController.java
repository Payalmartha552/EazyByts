package com.nadg.controller;


import com.nadg.entity.Article;
import com.nadg.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/source/{source}")
    public List<Article> getArticlesBySource(@PathVariable String source) {
        return articleService.getArticlesBySource(source);
    }

    @GetMapping("/search")
    public List<Article> searchArticles(@RequestParam String keyword) {
        return articleService.searchArticles(keyword);
    }
}
