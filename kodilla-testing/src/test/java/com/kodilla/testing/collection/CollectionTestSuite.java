package com.kodilla.testing.collection;

import com.kodilla.testing.collections.OddNumbersExterminator;
import org.junit.*;
import java.util.*;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Starting test of new condition");
    }
    @After
    public void after(){
        System.out.println("Finished test this condition");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting Global test");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Global Test finished");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(1);
        testArray.add(3);

        OddNumbersExterminator test = new OddNumbersExterminator();
        ArrayList<Integer> testingArray = test.exterminate(new ArrayList<Integer>());

        ArrayList result = new ArrayList<Integer>();

        Assert.assertEquals(result, testingArray);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(1);
        testArray.add(2);

        OddNumbersExterminator test = new OddNumbersExterminator();
        ArrayList<Integer> testingArray = test.exterminate(testArray);

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(2);

        Assert.assertEquals(result, testingArray);
    }
}
