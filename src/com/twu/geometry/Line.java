package com.twu.geometry;

import static java.lang.Math.*;

public class Line {
    private double x1,y1,x2,y2;
    public Line(double x1, double y1, double x2, double y2) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public double length() {

        return sqrt(pow(x2 - x1,2)+pow(y2 - y1, 2));
    }
}
