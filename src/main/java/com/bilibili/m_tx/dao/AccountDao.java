package com.bilibili.m_tx.dao;

/**
 * Author:BY
 * Date:2020/3/21
 * Description:
 */
public interface AccountDao {
    void out(String out, Integer money);
    void in(String in, Integer money);
}
