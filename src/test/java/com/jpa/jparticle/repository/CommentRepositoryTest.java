package com.jpa.jparticle.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CommentRepositoryTest {
    @Autowired
    CommentRepository commentRepository;
    @Test
    void findByArticleId() {
    }
    @Test
    void findByNickname() {
    }
}
