package com.huzz.service;

import com.huzz.util.PageRequest;
import com.huzz.util.PageResult;

public interface ArticleService {

    PageResult findAllArticle(PageRequest pageRequest);
}
