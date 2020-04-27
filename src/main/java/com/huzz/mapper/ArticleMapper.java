package com.huzz.mapper;

import com.huzz.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface ArticleMapper {


    // 根据ID获取文章内容
    public Article selectArticle(Integer id);

    // 获取所有内容
    List<Article> selectAllArticle();

}
