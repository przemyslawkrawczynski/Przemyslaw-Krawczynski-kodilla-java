package com.kodilla.testing.forum.statistics;

import java.util.*;

public class CountStatistics {

    private int userNumbers;
    private int totalPostNumber;
    private int totalCommentNumber;
    private double avgPostsPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;
    private boolean forumHasUsers;

    public void calculateAdvStatistics(Statistics statistics) {

       if(statistics.usersNames().size()>=0) {

            userNumbers = statistics.usersNames().size();
            totalPostNumber = statistics.postsCount();
            totalCommentNumber = statistics.commentsCount();
            avgPostsPerUser = totalPostNumber / (new Double(userNumbers));
            avgCommentPerUser = totalCommentNumber / (new Double(userNumbers));
            avgCommentPerPost = totalCommentNumber / new Double(totalPostNumber);

       } else {
            forumHasUsers = false;
       }
    }

    public void showStatistics() {
        System.out.println("Total number of Users: " + userNumbers);
        System.out.println("Total number of Posts: " + totalPostNumber);
        System.out.println("Total number of Comments: " + totalCommentNumber);
        System.out.println("Avarage Posts per Users: " + avgPostsPerUser);
        System.out.println("Average Comments per User: " + avgCommentPerUser);
        System.out.println("Average Comments per Post: " + avgCommentPerPost);
    }

    public int getUserNumbers() {
        return userNumbers;
    }

    public int getTotalPostNumber() {
        return totalPostNumber;
    }

    public int getTotalCommentNumber() {
        return totalCommentNumber;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    public boolean getForumHasUser() {
        return forumHasUsers;
    }
}
