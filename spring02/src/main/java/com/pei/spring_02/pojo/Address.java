package com.pei.spring_02.pojo;

/**
 * @ClassName Address
 * @Deacription
 * @Author peipei
 * @Date 2020/1/16 23:10
 * @Version 1.0
 **/
public class Address {
    private String addressName;

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressName='" + addressName + '\'' +
                '}';
    }
}
