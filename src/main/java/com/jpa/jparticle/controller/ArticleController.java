package com.jpa.jparticle.controller;

import com.jpa.jparticle.dto.ArticleForm;
import com.jpa.jparticle.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticleForm() {

        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());

        // 1. Dto를 Entity 변환
        Article article = form.toEntity();


        return "";
    }
}