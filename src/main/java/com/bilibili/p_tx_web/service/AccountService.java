package com.bilibili.p_tx_web.service;

/**
 * Author:BY
 * Date:2020/3/21
 * Description:
 */
public interface AccountService {
    void transfer(String outer, String inner, Integer money);
}
