package com.twu.geometry;

import static java.lang.Math.*;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (other == null || !(other instanceof Point))
            return false;
        Point otherPoint = (Point) other;
        return comparePoints(otherPoint);
    }

    private boolean comparePoints(Point otherPoint) {
        return x == otherPoint.x && y == otherPoint.y;
    }

    public double distanceFrom(Point point1) {

        return sqrt(pow(x - point1.x, 2) + pow(y - point1.y, 2));
    }

    @Override
    public int hashCode() {
        double hash = 7;
        int y1=-10;
        int x1=-10;
        hash = hash * 7 + this.x;
        hash = hash * 7 + this.y;
        return (int) hash;
    }
}
