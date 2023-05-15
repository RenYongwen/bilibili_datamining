package com.nk.domain;

public class Showprice {
    private Integer num;
    private String name;
    private Float minprice;
    private Float maxprice;
    private Float avglow;
    private Float avghigh;

    @Override
    public String toString() {
        return "Showprice{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", minprice=" + minprice +
                ", maxprice=" + maxprice +
                ", avglow=" + avglow +
                ", avghigh=" + avghigh +
                '}';
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMinprice() {
        return minprice;
    }

    public void setMinprice(Float minprice) {
        this.minprice = minprice;
    }

    public Float getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(Float maxprice) {
        this.maxprice = maxprice;
    }

    public Float getAvglow() {
        return avglow;
    }

    public void setAvglow(Float avglow) {
        this.avglow = avglow;
    }

    public Float getAvghigh() {
        return avghigh;
    }

    public void setAvghigh(Float avghigh) {
        this.avghigh = avghigh;
    }

    public Showprice() {
    }

    public Showprice(Integer num, String name, Float minprice, Float maxprice, Float avglow, Float avghigh) {
        this.num = num;
        this.name = name;
        this.minprice = minprice;
        this.maxprice = maxprice;
        this.avglow = avglow;
        this.avghigh = avghigh;
    }
}
