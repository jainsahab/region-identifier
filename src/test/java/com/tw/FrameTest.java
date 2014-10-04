package com.tw;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FrameTest {
  @Test
  public void tellWhetherThePointIsValidOrNot(){
    Frame frame = new Frame(null, 3, 2);

    assertFalse(frame.isValidPoint(new Point(0, 0)));
    assertTrue(frame.isValidPoint(new Point(3, 2)));
  }

  @Test
  public void shouldGivePixelOfCorrespondingPoint(){

    Pixel green11 = new Pixel(new Point(1, 1), "G");
    Pixel green12 = new Pixel(new Point(1, 2), "G");
    Pixel red21 = new Pixel(new Point(2, 1), "R");
    Pixel red22 = new Pixel(new Point(2, 2), "R");
    Frame frame = new Frame(Arrays.asList(green11, green12, red21, red22), 2, 2);

    assertThat(frame.getPixel(new Point(1, 1)), is(green11));
    assertThat(frame.getPixel(new Point(3,1)), is(nullValue()));
  }

  @Test
  public void shouldGiveNeighbouringPixelsOfSameColor(){
    Pixel green11 = new Pixel(new Point(1, 1), "G");
    Pixel green12 = new Pixel(new Point(1, 2), "G");
    Pixel red21 = new Pixel(new Point(2, 1), "R");
    Pixel red22 = new Pixel(new Point(2, 2), "R");
    Frame frame = new Frame(Arrays.asList(green11, green12, red21, red22), 2, 2);

    assertThat(frame.getNeighbouringPixelsOfSameColor(green11), is(Arrays.asList(green12)));
  }

}