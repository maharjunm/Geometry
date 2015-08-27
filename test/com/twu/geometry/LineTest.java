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

    @Test
    public void shouldCalculateLengthForALineWhichLiesOnYAxis() {
        Line line=new Line(0,1,0,2);
        double actual=line.length();

        Assert.assertEquals(1.0,actual,0.2d);
    }

    @Test
    public void shouldCalculateLengthForALine() {
        Line line=new Line(1,1,2,2);
        double actual=line.length();

        Assert.assertEquals(Math.sqrt(2),actual,0.2d);
    }

    @Test
    public void shouldBeEqualWhenLineComparesItself() {
        Line line=new Line(1,1,2,2);

        Assert.assertEquals(line,line);
    }

    @Test
    public void shouldNotBeEqualWhenLineComparesWithANull() {
        Line line1=new Line(1,1,2,2);
        Line line2=null;

        Assert.assertNotEquals(line1,line2);
    }

    @Test
    public void shouldNotBeEqualWhenLineComparesWithOtherObject() {
        Line line1=new Line(1,1,2,2);

        Assert.assertNotEquals(line1,2);
    }
}
