package com.tw;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Point {

  int x;

  int y;

  public List<Point> getNeighbouringPoints() {
    ArrayList<Point> points = new ArrayList<Point>();
    points.add(this.right());
    points.add(this.down());
    points.add(this.top());
    points.add(this.left());
    return points;
  }

  private Point down() {
    return new Point(this.x, this.y + 1);
  }

  private Point top() {
    return new Point(this.x, this.y - 1);
  }

  private Point right() {
    return new Point(this.x + 1, this.y);
  }

  private Point left() {
    return new Point(this.x - 1, this.y);
  }


}
