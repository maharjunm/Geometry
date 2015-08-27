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


    @Override
    public boolean equals(Object other) {
        if(other==null)
            return false;
        if(!(other instanceof Line))
            return false;
        Line otherLine=(Line)other;
        if(x1==otherLine.x1 && y1==otherLine.y1 && x2==otherLine.x2 && y2==otherLine.y2)
            return true;
        return false;
    }

}
