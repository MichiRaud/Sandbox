package com.pixel.level1.task3;

public class AreaOfTrian {
    public double areaOfTriangle(Point pointA, Point pointB, Point pointC){
        double area;

        area = Math.abs(pointA.getX() * (pointB.getY() - pointC.getY())
                + pointB.getX() * (pointC.getY() - pointA.getY())
                + pointC.getX() * (pointA.getY() - pointB.getY()));
        area /=2;

        return area;
    }
}
