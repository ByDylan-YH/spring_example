package com.bilibili.b_di.service.impl;

import com.bilibili.b_di.service.BookService;
import com.bilibili.b_di.dao.BookDao;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
class BookServiceImp implements BookService {

    //    方式1:接口=实现类;耦合 -- 接口=具体实现类
//    private BookDao bookDao = new BookDaoImp();
//    方式2:接口 + set 解耦 -- 接口;
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook() {
        this.bookDao.save();
    }
}
