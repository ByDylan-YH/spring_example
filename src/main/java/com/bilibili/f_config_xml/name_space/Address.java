package com.bilibili.f_config_xml.name_space;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class Address {
    private String addr;
    private String tel;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
