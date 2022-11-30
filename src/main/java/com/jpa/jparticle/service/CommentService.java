package com.jpa.jparticle.service;

import com.jpa.jparticle.dto.CommentDto;
import com.jpa.jparticle.entity.Comment;
import com.jpa.jparticle.repository.ArticleRepository;
import com.jpa.jparticle.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ArticleRepository articleRepository;

    public List<CommentDto> comments(Long articleId) {
        // 조회: 댓글 목록
        List<Comment> comments = commentRepository.findByArticleId(articleId);
        // 변환: 엔티티 -> DTO
        List<CommentDto> dtos = new ArrayList<CommentDto>();
        for (int i = 0; i < comments.size(); i++) {
            Comment c = comments.get(i);
            CommentDto dto = CommentDto.createCommentDto(c);
            dtos.add(dto);
        }
        // 반환
        return dtos;

    }
}
