package com.pei.spring_test;

/**
 * @ClassName Hello
 * @Deacription
 * @Author peipei
 * @Date 2020/1/15 23:33
 * @Version 1.0
 **/

public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String show() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
