package com.twu.geometry;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
        return 0;
    }
}
