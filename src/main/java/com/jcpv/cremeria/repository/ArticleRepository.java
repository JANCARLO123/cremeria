package com.jcpv.cremeria.repository;

import com.jcpv.cremeria.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jancarlo on 15/02/18.
 */
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
