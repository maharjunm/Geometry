package com.twu.geometry;

import static java.lang.Math.*;

public class Line {
    private Point startPoint, endPoint;

    public Line(double x1, double y1, double x2, double y2) {
        startPoint = new Point(x1, y1);
        endPoint = new Point(x2, y2);
    }

    public double length() {

        return sqrt(squareDifference(endPoint.getX(), startPoint.getX()) + squareDifference(endPoint.getY(), startPoint.getY()));
    }

    private double squareDifference(double value1, double value2) {
        return pow(value1 - value2, 2);
    }


    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Line))
            return false;
        Line otherLine = (Line) other;
        return compareLineWithCoordinatePairsInterchangibly(otherLine);
    }

    private boolean compareLineWithCoordinatePairsInterchangibly(Line otherLine) {
        return compareLineWithCoordinatePairs(otherLine.startPoint, otherLine.endPoint) ||
                compareLineWithCoordinatePairs(otherLine.endPoint, otherLine.startPoint);
    }

    private boolean compareLineWithCoordinatePairs(Point startPoint, Point endPoint) {
        return this.startPoint.equals(startPoint)&& this.endPoint.equals(endPoint);
    }

}
