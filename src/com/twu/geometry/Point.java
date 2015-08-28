package com.twu.geometry;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (!(other instanceof Point))
            return false;
        if (other == this)
            return true;
        Point otherPoint = (Point) other;
        if (x == otherPoint.x && y == otherPoint.y)
            return true;
        return false;
    }
}
