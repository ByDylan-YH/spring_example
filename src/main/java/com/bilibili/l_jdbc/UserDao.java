package com.bilibili.l_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Author:BY
 * Date:2020/3/20
 * Description:
 */
class UserDao {
    private JdbcTemplate jdbcTemplate;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void update() {
        String sql = "insert into user values (?,?,?);";
        Object[] args = {user.getId(), user.getUsername(), user.getPassword()};
        jdbcTemplate.update(sql, args);
        System.out.println("Execution completed^_^");
    }
}
