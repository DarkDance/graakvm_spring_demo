package com.demo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.data.querydsl.QSort;

public class DemoQry {

    private static final QDemo DEMO = QDemo.demo;

    public static Pageable searchPostCateOrder(Pageable pageable) {
        return QPageRequest.of(pageable.getPageNumber(), pageable.getPageSize(),
                QSort.by(DEMO.id.asc()));
    }
}
