package com.nk.domain;

public class Showcity {
    private String city;
    private Integer num;
    private Float cityprice;

    @Override
    public String toString() {
        return "Showcity{" +
                "city='" + city + '\'' +
                ", num=" + num +
                ", cityprice=" + cityprice +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getCityprice() {
        return cityprice;
    }

    public void setCityprice(Float cityprice) {
        this.cityprice = cityprice;
    }

    public Showcity() {
    }

    public Showcity(String city, Integer num, Float cityprice) {
        this.city = city;
        this.num = num;
        this.cityprice = cityprice;
    }
}
