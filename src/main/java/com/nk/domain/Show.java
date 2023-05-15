package com.nk.domain;

public class Show {
    private Integer id;
    private String name;
    private String type;
    private String city;
    private String district;
    private String time;
    private String sal_point;
    private Integer price_low;
    private Integer price_high;
    private String url;

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", time='" + time + '\'' +
                ", sal_point='" + sal_point + '\'' +
                ", price_low=" + price_low +
                ", price_high=" + price_high +
                ", url='" + url + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSal_point() {
        return sal_point;
    }

    public void setSal_point(String sal_point) {
        this.sal_point = sal_point;
    }

    public Integer getPrice_low() {
        return price_low;
    }

    public void setPrice_low(Integer price_low) {
        this.price_low = price_low;
    }

    public Integer getPrice_high() {
        return price_high;
    }

    public void setPrice_high(Integer price_high) {
        this.price_high = price_high;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Show() {
    }

    public Show(Integer id, String name, String type, String city, String district, String time, String sal_point, Integer price_low, Integer price_high, String url) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.city = city;
        this.district = district;
        this.time = time;
        this.sal_point = sal_point;
        this.price_low = price_low;
        this.price_high = price_high;
        this.url = url;
    }
}
