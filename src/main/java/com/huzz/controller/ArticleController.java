package com.huzz.controller;

import com.huzz.service.ArticleService;
import com.huzz.util.PageRequest;
import com.huzz.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @RequestMapping("/getAllArtic")
    private String getAllArtic(Model model, PageRequest pageRequest,Integer totalPages){
        if(totalPages !=null && pageRequest.getPageNum() >= totalPages){
            pageRequest.setPageNum(totalPages);
        }
        if(pageRequest.getPageNum() <= 0){
            pageRequest.setPageNum(1);
        }
        PageResult allArticle = articleService.findAllArticle(pageRequest);
        model.addAttribute("articleList",allArticle.getContent());
        model.addAttribute("pageNum",allArticle.getPageNum());
        model.addAttribute("pageSize",allArticle.getPageSize());
        model.addAttribute("totalPages",allArticle.getTotalPages());
        model.addAttribute("totalSize",allArticle.getTotalSize());
        return "client/index";
    }
}
