package com.bilibili.n_proxy_tx.dao.impl;

import com.bilibili.n_proxy_tx.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Author:BY
 * Date:2020/3/21
 * Description:
 */
class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String out, Integer money) {
        this.getJdbcTemplate().update("update account set money = money - ? where username = ?;", money, out);

    }

    @Override
    public void in(String in, Integer money) {
        this.getJdbcTemplate().update("update account set money = money + ? where username = ?;", money, in);
    }
}
