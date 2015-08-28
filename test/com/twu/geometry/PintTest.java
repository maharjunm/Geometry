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

    @Test
    public void shouldNotBeEqualWhenCompareWithOtherInstance(){
        Point point1=new Point(1.0,2.0);
        Assert.assertNotEquals(point1,2);
    }

    @Test
    public void shouldNotBeEqualWhenXisNotEqual(){
        Point point1=new Point(1.0,2.0);
        Point point2=new Point(2.0,2.0);
        Assert.assertNotEquals(point1,point2);
    }
}
