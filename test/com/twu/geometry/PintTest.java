package com.twu.geometry;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PintTest {

    @Test
    public void shouldBeEqualWhenCompareWithItself() {
        Point point = new Point(1.0, 2.0);
        assertEquals(point, point);
    }

    @Test
    public void shouldNotBeEqualWhenCompareWithNullPointModified() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = null;
        assertNotEquals(point1, point2);
    }

    @Test
    public void shouldNotBeEqualWhenCompareWithOtherInstance() {
        Point point1 = new Point(1.0, 2.0);
        assertNotEquals(point1, 2);
    }

    @Test
    public void shouldNotBeEqualWhenXisNotEqualModified() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(2.0, 2.0);
        assertNotEquals(point1, point2);
    }

    @Test
    public void shouldNotBeEqualWhenYisNotEqual() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(1.0, 3.0);
        assertNotEquals(point1, point2);
    }

    @Test
    public void shouldBeEqualWhenBothHasSamePoints() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(1.0, 2.0);
        assertEquals(point1, point2);
    }


    @Test
    public void modifiedCodeForPointsWhenBothHavingDifferentYValues() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(1.0, 3.0);
        assertNotEquals(point1, point2);
    }

    @Test
    public void shouldReturnZeroBtweenSamePoints() {
        Point point1 = new Point(1.0, 2.0);
        assertEquals(0.0, point1.distanceFrom(point1), 0.2d);
    }

    @Test
    public void shouldReturnDifferenceOfXCoordiantesIfTheyHaveOnlyXCoordinatesDifferent() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(2.0, 0.0);
        assertEquals(1.0, point1.distanceFrom(point2), 0.2d);
    }

    @Test
    public void shouldReturnDifferenceOfYCoordiantesIfTheyHaveOnlyYCoordinatesDifferent() {
        Point point1 = new Point(0.0, 1.0);
        Point point2 = new Point(0.0, 2.0);
        assertEquals(1.0, point1.distanceFrom(point2), 0.2d);
    }
}
