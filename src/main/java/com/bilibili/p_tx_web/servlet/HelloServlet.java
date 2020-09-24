package com.bilibili.p_tx_web.servlet;

import com.bilibili.p_tx_web.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:BY
 * Date:2020/3/22Z
 * Description:
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        super.doGet(req, resp);
//        方式一:手动从作用域中获取
        ApplicationContext applicationContext = (ApplicationContext) this.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
//        方式二:通过工具获取,它不需要强转
        ApplicationContext applicationContext2 = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());

        AccountService accountService = applicationContext.getBean("accoutService_anno", AccountService.class);
        accountService.transfer("dylan", "jack", 500);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
