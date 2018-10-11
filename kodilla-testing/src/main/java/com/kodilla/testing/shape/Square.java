package com.kodilla.testing.shape;

public class Square implements Shape{

    private double sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public String getShapeName() {
        return "SQUARE";
    }

    @Override
    public double getField() {
        return sideA * sideA;
    }
}
