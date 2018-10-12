package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<Shape>();
    
    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        if(n > -1 && n < shapeList.size() ) {
            return shapeList.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {
        String names = "Your ShapeList don`t have any objects";

        for(int i=0;i < shapeList.size();i++) {
            if(i==0) {
                names = shapeList.get(i).getShapeName();
            } else {
                names = names + " "  + shapeList.get(i).getShapeName();
            }
        }
        return names;
    }

    public int getShapeListQuantity() {
        return shapeList.size();
    }
}
