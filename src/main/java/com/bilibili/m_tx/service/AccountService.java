package com.bilibili.m_tx.service;

/**
 * Author:BY
 * Date:2020/3/21
 * Description:
 */
public interface AccountService {
    void transfer(String outer, String inner, Integer money);
}
