package com.nk.domain;

import java.io.Serializable;

public class Opera implements Serializable {
    private Integer id;
    private String name;
    private String episode;
    private String score;
    private Integer num;
    private Integer likes;
    private Integer coins;
    private Integer views;
    private Integer follow;
    private Integer danmu;

    @Override
    public String toString() {
        return "Opera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", episode='" + episode + '\'' +
                ", score='" + score + '\'' +
                ", num=" + num +
                ", likes=" + likes +
                ", coins=" + coins +
                ", views=" + views +
                ", follow=" + follow +
                ", danmu=" + danmu +
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

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getFollow() {
        return follow;
    }

    public void setFollow(Integer follow) {
        this.follow = follow;
    }

    public Integer getDanmu() {
        return danmu;
    }

    public void setDanmu(Integer danmu) {
        this.danmu = danmu;
    }

    public Opera() {
    }

    public Opera(Integer id, String name, String episode, String score, Integer num, Integer likes, Integer coins, Integer views, Integer follow, Integer danmu) {
        this.id = id;
        this.name = name;
        this.episode = episode;
        this.score = score;
        this.num = num;
        this.likes = likes;
        this.coins = coins;
        this.views = views;
        this.follow = follow;
        this.danmu = danmu;
    }
}
