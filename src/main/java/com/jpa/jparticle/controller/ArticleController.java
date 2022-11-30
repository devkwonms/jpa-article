package com.jpa.jparticle.controller;

import com.jpa.jparticle.dto.ArticleForm;
import com.jpa.jparticle.entity.Article;
import com.jpa.jparticle.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j  // logging을 위한 lombok annotation
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {

        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());    // println() 을 로깅으로 대체!

        // 1. Dto를 Entity 변환
        Article article = form.toEntity();
        log.info(article.toString()); // println() 을 로깅으로 대체!

        // 2. Repository에게 Entity를 DB로 저장하게 함
        Article saved = articleRepository.save(article);
        log.info(saved.toString());   // println() 을 로깅으로 대체!


        return "";
    }
}