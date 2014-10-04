package com.tw;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Pixel {

  Point point;

  String color;

  Frame frame;

  public List<Point> getNeighbouringPoints() {
    return this.point.getNeighbouringPoints();
  }
}
