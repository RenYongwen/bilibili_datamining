package com.nk.domain;

public class Top {
    private String id;
    private String topic;
    private String view;
    private String bullet;
    private String upname;
    private String like;
    private String coin;
    private String collect;
    private String share;
    private String url;
    private String score;

    @Override
    public String toString() {
        return "top{" +
                "id='" + id + '\'' +
                ", topic='" + topic + '\'' +
                ", view='" + view + '\'' +
                ", bullet='" + bullet + '\'' +
                ", upname='" + upname + '\'' +
                ", like='" + like + '\'' +
                ", coin='" + coin + '\'' +
                ", collect='" + collect + '\'' +
                ", share='" + share + '\'' +
                ", url='" + url + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getBullet() {
        return bullet;
    }

    public void setBullet(String bullet) {
        this.bullet = bullet;
    }

    public String getUpname() {
        return upname;
    }

    public void setUpname(String upname) {
        this.upname = upname;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getCollect() {
        return collect;
    }

    public void setCollect(String collect) {
        this.collect = collect;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Top() {
    }

    public Top(String id, String topic, String view, String bullet, String upname, String like, String coin, String collect, String share, String url, String score) {
        this.id = id;
        this.topic = topic;
        this.view = view;
        this.bullet = bullet;
        this.upname = upname;
        this.like = like;
        this.coin = coin;
        this.collect = collect;
        this.share = share;
        this.url = url;
        this.score = score;
    }
}

