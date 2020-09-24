package com.bilibili.g_annotation.web;

import com.bilibili.g_annotation.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
// web层规范请使用Controller,用Component原则上也可以
@Controller("studentAction")
class StudentAction {
    @Autowired // 默认按照类型
    private StudentService studentService;

    void exection() {
        studentService.addStudent();
    }
}
