package com.nk.domain;

import java.io.Serializable;

public class Video  implements Serializable {
    private Integer id;
    private Integer rank;
    private Integer view;
    private Integer coin;
    private Integer love;
    private Integer favorite;
    private Integer share;
    private Integer reply;

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", rank=" + rank +
                ", view=" + view +
                ", coin=" + coin +
                ", love=" + love +
                ", favorite=" + favorite +
                ", share=" + share +
                ", reply=" + reply +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getLove() {
        return love;
    }

    public void setLove(Integer love) {
        this.love = love;
    }

    public Integer getFavorite() {
        return favorite;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }

    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public Integer getReply() {
        return reply;
    }

    public void setReply(Integer reply) {
        this.reply = reply;
    }

    public Video(Integer id, Integer rank, Integer view, Integer coin, Integer love, Integer favorite, Integer share, Integer reply) {
        this.id = id;
        this.rank = rank;
        this.view = view;
        this.coin = coin;
        this.love = love;
        this.favorite = favorite;
        this.share = share;
        this.reply = reply;
    }

    public Video() {
    }
}
