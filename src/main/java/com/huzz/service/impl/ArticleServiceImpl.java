package com.huzz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huzz.mapper.ArticleMapper;
import com.huzz.pojo.Article;
import com.huzz.service.ArticleService;
import com.huzz.util.PageRequest;
import com.huzz.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public PageResult findAllArticle(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        List<Article> articleList = articleMapper.selectAllArticle();
        PageInfo<Article> articlePageInfo = new PageInfo<>(articleList);
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageNum);
        pageResult.setPageSize(pageSize);
        pageResult.setTotalPages(articlePageInfo.getPages());
        pageResult.setTotalSize(articlePageInfo.getTotal());
        pageResult.setContent(articleList);
        System.out.printf("_______-----"+pageResult);
        return pageResult;
    }
}
