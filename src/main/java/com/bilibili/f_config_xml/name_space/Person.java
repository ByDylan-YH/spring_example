package com.bilibili.f_config_xml.name_space;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class Person {
    private String name;
    private Integer age;
    private Address homedir;
    private Address companydir;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getHomedir() {
        return homedir;
    }

    public void setHomedir(Address homedir) {
        this.homedir = homedir;
    }

    public Address getCompanydir() {
        return companydir;
    }

    public void setCompanydir(Address companydir) {
        this.companydir = companydir;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homedir=" + homedir +
                ", companydir=" + companydir +
                '}';
    }
}
