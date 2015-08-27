package com.twu.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PintTest {

    @Test
    public void shouldBeEqualWhenCompareWithItself(){
        Point point=new Point(1.0,2.0);
        Assert.assertEquals(point,point);
    }

    @Test
    public void shouldNotBeEqualWhenCompareWithNullPoint(){
        Point point1=new Point(1.0,2.0);
        Point point2=null;
        Assert.assertNotEquals(point1,point2);
    }
}
