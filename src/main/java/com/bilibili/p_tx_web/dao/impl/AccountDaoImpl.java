package com.bilibili.p_tx_web.dao.impl;

import com.bilibili.o_tx_anno.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Author:BY
 * Date:2020/3/21
 * Description:
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String out, Integer money) {
        this.getJdbcTemplate().update("update account set money = money - ? where username = ?;", money, out);

    }

    @Override
    public void in(String in, Integer money) {
        this.getJdbcTemplate().update("update account set money = money + ? where username = ?;", money, in);
    }
}
