package com.example.demo2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "userInfo")
public class userInfo {
    @Id
    private String userId;
    private String userPw;
    private List<WishList> wishLists;

    protected userInfo() {
        this.wishLists = new ArrayList<>();}

    public userInfo(String userId, String userPw, List<WishList> wishLists) {
        this.userId = userId;
        this.userPw = userPw;
        this.wishLists = wishLists;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public List<WishList> getWishLists() {
        return wishLists;
    }

    public void setWishLists(List<WishList> wishLists) {
        this.wishLists = wishLists;
    }
}
