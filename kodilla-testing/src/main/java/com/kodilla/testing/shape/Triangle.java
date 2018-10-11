package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double lenghtSideA;
    private double height;

    public Triangle(double lenghtSideA, double height) {
        this.lenghtSideA = lenghtSideA;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "TRIANGLE";
    }

    @Override
    public double getField() {
        return 0.5 * lenghtSideA * height;
    }
}
