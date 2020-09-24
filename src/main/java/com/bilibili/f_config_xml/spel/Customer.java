package com.bilibili.f_config_xml.spel;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class Customer {
    private String name;
    private Double pi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Cusomer{" +
                "name=" + name +
                ", pi='" + pi + '\'' +
                '}';
    }
}
