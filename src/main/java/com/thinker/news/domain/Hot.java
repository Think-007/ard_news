package com.thinker.news.domain;

/**
 * Hot.java
 * <p>新闻热度
 * Created by LPF on 2017/10/22.
 * <p>
 * 比你优秀的人还在努力，所以你不能懒惰。
 * <p>
 * Copyright (c)  2017, LPF 版权所有!
 */
public class Hot {

    //新闻id
    private String id;
    //阅读量
    private int readNumber;
    //点赞量
    private int godNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(int readNumber) {
        this.readNumber = readNumber;
    }

    public int getGodNumber() {
        return godNumber;
    }

    public void setGodNumber(int godNumber) {
        this.godNumber = godNumber;
    }

    @Override
    public String toString() {
        return "Hot{" +
                "id='" + id + '\'' +
                ", readNumber=" + readNumber +
                ", godNumber=" + godNumber +
                '}';
    }
}
