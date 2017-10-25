package com.thinker.news.domain;

import java.io.Serializable;

/**
 * User.java
 * <p>
 * Created by LPF on 2017/10/22.
 * <p>
 * 比你优秀的人还在努力，所以你不能懒惰。
 * <p>
 * Copyright (c)  2017, LPF 版权所有!
 */
public  class User implements Serializable{
    //用户id
    private String userId;
    //名称
    private String userName;
    //性别 0 男 1 女
    private int sex;
    //电话号码
    private String telNumber;
    //绑定微信
    private String weiChatId;
    //头像
    private String headURI;



}
