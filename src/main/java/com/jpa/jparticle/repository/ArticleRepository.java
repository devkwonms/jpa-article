package com.jpa.jparticle.repository;

import com.jpa.jparticle.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> {
}
