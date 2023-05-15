package com.nk.domain;

public class User {
    Integer id;
    String name;
    String sex;
    String sign;
    String rank;
    String face;
    String birthday;
    Integer level;
    Integer coins;
    Integer following;
    Integer fans;
    Integer archiveview;
    Integer article;

    public User() {
    }

    public User(Integer id, String name, String sex, String sign, String rank, String face, String birthday, Integer level,
                Integer coins, Integer following, Integer fans, Integer archiveview, Integer article) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.sign = sign;
        this.rank = rank;
        this.face = face;
        this.birthday = birthday;
        this.level = level;
        this.coins = coins;
        this.following = following;
        this.fans = fans;
        this.archiveview = archiveview;
        this.article = article;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getArchiveview() {
        return archiveview;
    }

    public void setArchiveview(Integer archiveview) {
        this.archiveview = archiveview;
    }

    public Integer getArticle() {
        return article;
    }

    public void setArticle(Integer article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", sign='" + sign + '\'' +
                ", rank='" + rank + '\'' +
                ", face='" + face + '\'' +
                ", birthday='" + birthday + '\'' +
                ", level=" + level +
                ", coins=" + coins +
                ", following=" + following +
                ", fans=" + fans +
                ", archiveview=" + archiveview +
                ", article=" + article +
                '}';
    }
}
