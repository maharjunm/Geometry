package com.twu.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PintTest {

    @Test
    public void shouldBeTrueWhenCompareWithItself(){
        Point point=new Point();
        Assert.assertEquals(point,point);
    }
}
