package com.kodilla.testing.forum.statistics;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CountStatisticTestSuite {

    private static int testNumber = 0;

    @BeforeClass
    public static void beforeStartTesting() {
        System.out.println("Starting test.. ");
    }

    @AfterClass
    public static void afterTest() {
        System.out.println("All test are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testNumber++;
        System.out.println("Preparing to execute test #" + testNumber);
    }

    // Posts = 0
    @Test
    public void TestCalculateAdvStatistics() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        CountStatistics stat = new CountStatistics();

        ArrayList<String> userList = new ArrayList<String>();

        userList.add("Franek");
        userList.add("Janek");
        userList.add("Gienek");

        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);

        // Calculating Statistics...
        stat.calculateAdvStatistics(statisticMock);

        int postNumbers = stat.getTotalPostNumber();
        int expectedResult = 0;

       double avgPostPerUser = stat.getAvgPostsPerUser();
        double expectedResult2 = 0.0;

        Assert.assertEquals(expectedResult, postNumbers);
        Assert.assertEquals(expectedResult2, avgPostPerUser, 0.1);

    }

    // Posts = 1000
    @Test
    public void TestCalculateAdvStatistics2() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        CountStatistics stat = new CountStatistics();

        ArrayList<String> userList = new ArrayList<String>();

        userList.add("Franek");
        userList.add("Janek");
        userList.add("Gienek");
        userList.add("Heniek");
        userList.add("Jozek");

        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(0);

        // Calculating Statistics...
        stat.calculateAdvStatistics(statisticMock);


        double avgPostPerUser = stat.getAvgPostsPerUser();
        double expectedResult2 = 200.0;

        Assert.assertEquals(expectedResult2, avgPostPerUser, 0.1);

    }

    // Comments = 0
    @Test
    public void TestCalculateAdvStatistics3() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        CountStatistics stat = new CountStatistics();

        ArrayList<String> userList = new ArrayList<String>();

        userList.add("Franek");
        userList.add("Janek");
        userList.add("Gienek");
        userList.add("Heniek");
        userList.add("Jozek");

        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(100);
        when(statisticMock.commentsCount()).thenReturn(0);

        // Calculating Statistics...
        stat.calculateAdvStatistics(statisticMock);


        double avgCommentPerPost = stat.getAvgCommentPerPost();
        double expectedResult = 0.0;

        Assert.assertEquals(expectedResult, avgCommentPerPost, 0.1);

    }

    // Comments > Posts
    @Test
    public void TestCalculateAdvStatistics4() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        CountStatistics stat = new CountStatistics();

        ArrayList<String> userList = new ArrayList<String>();

        userList.add("Franek");
        userList.add("Janek");
        userList.add("Gienek");
        userList.add("Heniek");
        userList.add("Jozek");

        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(100);
        when(statisticMock.commentsCount()).thenReturn(1000);

        // Calculating Statistics...
        stat.calculateAdvStatistics(statisticMock);


        double avgCommentPerPost = stat.getAvgCommentPerPost();
        double expectedResult = 10.0;

        Assert.assertEquals(expectedResult, avgCommentPerPost, 0.1);

    }

    // Post >> Comments
    @Test
    public void TestCalculateAdvStatistics5() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        CountStatistics stat = new CountStatistics();

        ArrayList<String> userList = new ArrayList<String>();

        userList.add("Franek");
        userList.add("Janek");
        userList.add("Gienek");
        userList.add("Heniek");
        userList.add("Jozek");

        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(100);

        // Calculating Statistics...
        stat.calculateAdvStatistics(statisticMock);


        double avgCommentPerPost = stat.getAvgCommentPerPost();
        double expectedResult = 0.1;

        Assert.assertEquals(expectedResult, avgCommentPerPost, 0.1);

    }

    // Number of Users = 0
    @Test
    public void TestCalculateAdvStatistics6() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        CountStatistics stat = new CountStatistics();

        ArrayList<String> userList = new ArrayList<String>();

        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);

        // Calculating Statistics...

        boolean forumHasUsers = stat.getForumHasUser();
        boolean expectedResult = false;

        Assert.assertEquals(expectedResult, forumHasUsers);

    }

    // Number of Users = 100
    @Test
    public void TestCalculateAdvStatistics7() {
        // Given
        Statistics statisticMock = mock(Statistics.class);
        CountStatistics stat = new CountStatistics();

        ArrayList<String> userList = new ArrayList<String>();

        int userAmount = 100;
        addObjectoToList(userAmount, userList);

        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(200);
        when(statisticMock.commentsCount()).thenReturn(0);

        // Calculating Statistics...
        stat.calculateAdvStatistics(statisticMock);


        double userListSize = stat.getAvgPostsPerUser();
        double expectedResult = 2.0;

        Assert.assertEquals(expectedResult, userListSize, 0.1);

    }

    public void addObjectoToList(int n, ArrayList<String> list) {
        for(int i=0; i<n; i++) {
            String user = "" + "User" + (n + 1);
            list.add(user);
        }
    }
}
