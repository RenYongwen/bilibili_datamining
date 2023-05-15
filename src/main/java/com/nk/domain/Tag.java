package com.nk.domain;

public class Tag {
    Integer id;
    String name;
    String cover;
    Integer subscribed_count;
    Integer archive_count;
    Integer view_count;
    Integer featured_count;

    public Tag() {
    }

    public Tag(Integer id, String name, String cover, Integer subscribed_count, Integer archive_count, Integer view_count, Integer featured_count) {
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.subscribed_count = subscribed_count;
        this.archive_count = archive_count;
        this.view_count = view_count;
        this.featured_count = featured_count;
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getSubscribed_count() {
        return subscribed_count;
    }

    public void setSubscribed_count(Integer subscribed_count) {
        this.subscribed_count = subscribed_count;
    }

    public Integer getArchive_count() {
        return archive_count;
    }

    public void setArchive_count(Integer archive_count) {
        this.archive_count = archive_count;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public Integer getFeatured_count() {
        return featured_count;
    }

    public void setFeatured_count(Integer featured_count) {
        this.featured_count = featured_count;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", subscribed_count=" + subscribed_count +
                ", archive_count=" + archive_count +
                ", view_count=" + view_count +
                ", featured_count=" + featured_count +
                '}';
    }
}
