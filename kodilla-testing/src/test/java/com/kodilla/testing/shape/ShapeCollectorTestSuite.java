package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
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

    @Test
    public void testAddFigure() {

        Shape s1 = new Circle(5);
        ShapeCollector testList = new ShapeCollector();
        testList.addFigure(s1);

        String testedShapeName = testList.getFigure(0).getShapeName();
        String expectedResult = "CIRCLE";

        int testListQuantity = testList.getShapeListQuantity();
        int expectedResult2 = 1;

        Assert.assertEquals(expectedResult, testedShapeName);
        Assert.assertEquals(expectedResult2, testListQuantity);
    }

    @Test
    public void testRemoveFigure() {

        Shape s1 = new Triangle(5, 4);
        Shape s2 = new Square(5);
        ShapeCollector testList = new ShapeCollector();

        testList.addFigure(s1);
        testList.addFigure(s2);

        testList.removeFigure(s1);

        int numberOfObjectsInList = testList.getShapeListQuantity();
        int expectedResult = 1;

        Assert.assertEquals(expectedResult, numberOfObjectsInList);
    }

    @Test
    public void testGetFigure() {

        Shape s1 = new Triangle(5, 4);
        ShapeCollector testList = new ShapeCollector();
        testList.addFigure(s1);

        double shapeField = testList.getFigure(0).getField();
        double expectedResult = 10;

        Assert.assertEquals(expectedResult, shapeField, 0.1);
    }

    @Test
    public void testShowFigures() {

        Shape s1 = new Triangle(5, 4);
        Shape s2 = new Square(5);
        ShapeCollector testList = new ShapeCollector();
        testList.addFigure(s1);
        testList.addFigure(s2);

        String shapeNames = "" + testList.showFigures();
        String expectedResult = "TRIANGLE SQUARE";

        Assert.assertEquals(expectedResult, shapeNames);

    }
}
