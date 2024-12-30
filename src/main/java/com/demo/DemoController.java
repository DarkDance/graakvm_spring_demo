package com.demo;

import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 超级管理员 - 内容管理 - 文章归类接口
 *
 * @author wiiyaya
 * @since 2019/2/1.
 */
@RestController
@Validated
public class DemoController {

    @Resource
    private DemoService postCateService;

    @PostMapping("/test")
    public List<Demo> test() {
        return postCateService.postCatePage();
    }
}
