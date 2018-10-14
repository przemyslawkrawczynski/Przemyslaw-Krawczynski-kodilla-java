package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticStub implements Statistics {

    @Override
    public List<String> usersNames() {
        ArrayList<String> userList = new ArrayList<String>();

        userList.add("Franek");
        userList.add("Janek");
        userList.add("Gienek");

        return userList;
    }

    @Override
    public int postsCount() {

        int postCount = 5;
        return postCount;
    }

    @Override
    public int commentsCount() {

        int postComments = 14;
        return postComments;
    }
}
