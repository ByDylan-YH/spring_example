package com.bilibili.g_annotation.web.service.impl;

import com.bilibili.g_annotation.web.dao.StudentDao;
import com.bilibili.g_annotation.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
@Service
class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    @Autowired
    @Qualifier("studentDao") // qualifier的意思是合格者，通过这个标示，表明了哪个实现类才是我们所需要的
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent() {
        studentDao.save();
    }
}
