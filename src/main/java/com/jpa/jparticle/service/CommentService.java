package com.jpa.jparticle.service;

import com.jpa.jparticle.repository.ArticleRepository;
import com.jpa.jparticle.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ArticleRepository articleRepository;
}
