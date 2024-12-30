package com.demo;

import jakarta.annotation.Resource;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao postCateDao;

    @Override
    public List<Demo> postCatePage() {
        return postCateDao.findAll(DemoQry.searchPostCateOrder(Pageable.ofSize(10))).stream().toList();
    }
}
