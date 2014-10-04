package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrameTest {
  @Test
  public void tellWhetherThePointIsValidOrNot(){
    Frame frame = new Frame(null, 3, 2);

    assertFalse(frame.isValidPoint(new Point(0, 0)));
    assertTrue(frame.isValidPoint(new Point(3, 2)));
  }

}