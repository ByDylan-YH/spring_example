package com.bilibili.b_di.dao.impl;

import com.bilibili.b_di.dao.BookDao;

/**
 * Author:BY
 * Date:2020/3/12
 * Description:
 */
class BookDaoImp implements BookDao {

    @Override
    public void save() {
        System.out.println("BookDao save");
    }
}
