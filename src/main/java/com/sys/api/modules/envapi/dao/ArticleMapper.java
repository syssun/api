package com.sys.api.modules.envapi.dao;

import com.sys.api.modules.envapi.beans.Article;
import java.util.List;

public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    List<Article> selectAll();
}