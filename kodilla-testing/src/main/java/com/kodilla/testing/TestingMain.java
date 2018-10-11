package com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;

public class TestingMain {
    public static void main(String[] args){
        ShapeCollector test = new ShapeCollector();

        Shape s1 = new Circle(5);
        Shape s2 = new Circle(5);
        Shape s3 = new Circle(5);
        test.addFigure(s1);
        test.addFigure(s2);
        test.addFigure(s3);
        System.out.println(test.showFigures());

    }
}
