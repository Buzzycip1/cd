package com.campusdual.redsoclal;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private  String name;
    private List<Users> friendsList = new ArrayList<>();
    private List<Post> postList = new ArrayList<>();



    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Users> getFriendsList() {
        return friendsList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
