package com.thinker.news.domain;

import java.io.Serializable;

/**
 * News.java
 * <p>新闻模型
 * Created by LPF on 2017/10/22.
 * <p>
 * 比你优秀的人还在努力，所以你不能懒惰。
 * <p>
 * Copyright (c)  2017, LPF 版权所有!
 */
public class News implements Serializable {

    //新闻id
    private String id;
    //标题
    private String title;
    //内容
    private String content;
    //来源
    private String sourceId;
    //类型
    private String newsType;
    //时间
    private String publishTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    @Override
    public String toString() {
        return "News{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", newsType='" + newsType + '\'' +
                ", publishTime='" + publishTime + '\'' +
                '}';
    }
}
