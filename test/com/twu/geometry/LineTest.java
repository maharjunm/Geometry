package com.twu.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineTest {

    @Test
    public void shouldCalculateLengthAsZeroForStartingPointAndEndingPointAsSame() {
        Line line=new Line(0.0,0.0,0.0,0.0);
        double actual=line.length();

        Assert.assertEquals(0.0,actual,0.2d);
    }

    @Test
    public void shouldCalculateLengthForALineWhichLiesOnXAxis() {
        Line line=new Line(1,0.0,2,0.0);
        double actual=line.length();

        Assert.assertEquals(1.0,actual,0.2d);
    }
}
