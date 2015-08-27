package com.twu.geometry;

import static java.lang.Math.*;

public class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {

        return sqrt(squareDifference(x2, x1) + squareDifference(y2, y1));
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
        return compareLineWithCoordinatePairs(otherLine.x1, otherLine.y1, otherLine.x2, otherLine.y2) ||
                compareLineWithCoordinatePairs(otherLine.x2, otherLine.y2, otherLine.x1, otherLine.y1);
    }

    private boolean compareLineWithCoordinatePairs(double otherX1, double otherY1, double otherX2, double otherY2) {
        return x1 == otherX1 && y1 == otherY1 && x2 == otherX2 && y2 == otherY2;
    }

}
