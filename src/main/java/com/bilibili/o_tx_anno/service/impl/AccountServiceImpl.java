package com.bilibili.o_tx_anno.service.impl;

import com.bilibili.o_tx_anno.dao.AccountDao;
import com.bilibili.o_tx_anno.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author:BY
 * Date:2020/3/21
 * Description:
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Component("accountServiceImpl")
class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {
//        1.一般写法
        accountDao.in(inner, money);
//        模拟异常,会发现问题
//        int i = 1 / 0;
        accountDao.out(outer, money);
//        2.手动注入模板写法,由于是内部类,记得把参数设置为final,防止内部类改变参数,或者防止外部改变参数
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                accountDao.in(inner, money);
//                int i = 1 / 0;
//                accountDao.out(outer, money);
//            }
//        });
    }
}
