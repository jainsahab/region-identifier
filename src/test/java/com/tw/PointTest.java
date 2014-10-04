package com.tw;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PointTest {

  @Test
  public void shouldGetNeighbouringPoints() throws Exception {
    Point aPoint = new Point(1, 1);
    List<Point> neighbouringPoints = aPoint.getNeighbouringPoints();

    assertThat(neighbouringPoints.size(), is(4));
    assertTrue(neighbouringPoints.contains(new Point(1, 2)));
    assertTrue(neighbouringPoints.contains(new Point(2, 1)));
    assertTrue(neighbouringPoints.contains(new Point(1, 0)));
    assertTrue(neighbouringPoints.contains(new Point(0, 1)));

  }
}