package com.twu.geometry;

public class Point {

    @Override
    public boolean equals(Object other){
        Point otherPoint=(Point)other;
        if(other==this)
            return true;
        return false;
    }
}
