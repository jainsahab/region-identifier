package com.tw;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Frame {

  List<Pixel> pixels;

  int width;

  int height;

  public List<Pixel> getNeighboursOfSameColor(Pixel pixel) {
    List<Point> points = pixel.getNeighbouringPoints();


    return null;
  }

  public boolean isValidPoint(Point point) {
     return point.getX() > 0  && point.getX() <= getWidth() &&
         point.getY() > 0  && point.getY() <= getHeight();
  }
}
