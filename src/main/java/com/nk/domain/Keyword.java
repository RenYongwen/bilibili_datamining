package com.nk.domain;

public class Keyword {
    private String name;
    private String num;

    @Override
    public String toString() {
        return "Keyword{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Keyword() {
    }

    public Keyword(String name, String num) {
        this.name = name;
        this.num = num;
    }
}
