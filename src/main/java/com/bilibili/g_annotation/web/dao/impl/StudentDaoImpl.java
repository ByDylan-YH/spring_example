package com.bilibili.g_annotation.web.dao.impl;

import com.bilibili.g_annotation.web.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
@Repository("studentDao")
class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("dao");
    }
}
