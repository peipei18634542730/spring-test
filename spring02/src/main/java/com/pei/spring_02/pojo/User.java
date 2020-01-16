package com.pei.spring_02.pojo;

import java.util.*;

/**
 * @ClassName User
 * @Deacription
 * @Author peipei
 * @Date 2020/1/16 23:07
 * @Version 1.0
 **/

public class User {
    private String name;

    private String phone;

    private String[] books;

    private List hobbys;

    private Map card;

    private Set games;

    private String wife;

    private Properties properties;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List getHobbys() {
        return hobbys;
    }

    public void setHobbys(List hobbys) {
        this.hobbys = hobbys;
    }

    public Map getCard() {
        return card;
    }

    public void setCard(Map card) {
        this.card = card;
    }

    public Set getGames() {
        return games;
    }

    public void setGames(Set games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", properties=" + properties +
                ", address=" + address +
                '}';
    }
}
