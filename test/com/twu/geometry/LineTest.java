package com.twu.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineTest {

    @Test
    public void shouldCalculateLengthAsZeroForStartingPointAndEndingPointAsSame() {
        Line line = new Line(0.0, 0.0, 0.0, 0.0);
        double actual = line.length();

        Assert.assertEquals(0.0, actual, 0.2d);
    }

    @Test
    public void shouldCalculateLengthForALineWhichLiesOnXAxis() {
        Line line = new Line(1, 0.0, 2, 0.0);
        double actual = line.length();

        Assert.assertEquals(1.0, actual, 0.2d);
    }

    @Test
    public void shouldCalculateLengthForALineWhichLiesOnYAxis() {
        Line line = new Line(0, 1, 0, 2);
        double actual = line.length();

        Assert.assertEquals(1.0, actual, 0.2d);
    }

    @Test
    public void shouldCalculateLengthForALine() {
        Line line = new Line(1, 1, 2, 2);
        double actual = line.length();

        Assert.assertEquals(Math.sqrt(2), actual, 0.2d);
    }

    @Test
    public void shouldBeEqualWhenLineComparesItself() {
        Line line = new Line(1, 1, 2, 2);

        Assert.assertEquals(line, line);
    }

    @Test
    public void shouldNotBeEqualWhenLineComparesWithANull() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = null;

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenLineComparesWithOtherObject() {
        Line line1 = new Line(1, 1, 2, 2);

        Assert.assertNotEquals(line1, 2);
    }

    @Test
    public void shouldNotBeEqualWhenLineWithOtherLineWhichHasX1ValuesAsDifferentAndOtherAsSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(0, 1, 2, 2);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenLineWithOtherLineWhichHasY1ValuesAsDifferentAndOtherAsSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(1, 2, 2, 2);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenLineWithOtherLineWhichHasX2ValuesAsDifferentAndOtherAsSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(1, 1, 3, 2);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenLineWithOtherLineWhichHasY2ValuesAsDifferentAndOtherAsSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(1, 1, 2, 3);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenX1OfLine1AndX2OfLine2AreDifferentButOtherValuesAreEqual() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 2, 1);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenY1OfLineAndY2OfLine2AreDifferentButOtherValuesAreEqual() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 1, 2);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenX2OfLine1DifferFromLine2OfX1andOtherValuesAreSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(1, 2, 1, 1);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenY2OfLine1DifferFromLine2OfY1andOtherValuesAreSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 1, 1, 1);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldBeEqualWhenLinesHaveSameStartingAndEndingPoints() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(1, 1, 2, 2);

        Assert.assertEquals(line1, line2);
    }

    @Test
    public void shouldBeEqualWhenLinesHaveStaringPointsAndEndingPointsWereInterchanges() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 1, 1);

        Assert.assertEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenY1OfLine1AndY2OfLineAreNotSameAndRestOfThemAreSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 2, 1, 2);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenX2OfLine1AndX1OfLineAreNotSameAndRestOfThemAreSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(3, 2, 1, 1);

        Assert.assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotBeEqualWhenY2OfLine1AndY1OfLineAreNotSameAndRestOfThemAreSame() {
        Line line1 = new Line(1, 1, 2, 2);
        Line line2 = new Line(2, 4, 1, 1);

        Assert.assertNotEquals(line1, line2);
    }
}
