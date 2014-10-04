package com.tw;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Frame {

  List<Pixel> pixels;

  int width;

  int height;

  public boolean isValidPoint(Point point) {
     return point.getX() > 0  && point.getX() <= getWidth() &&
         point.getY() > 0  && point.getY() <= getHeight();
  }

  public Pixel getPixel(Point point) {
    for (Pixel pixel : pixels) {
      if(pixel.getPoint().equals(point))
        return pixel;
    }
    return null;
  }

  private List<Point> getValidNeighbouringPoints(Point point) {
    List<Point> allNeighbours = point.getNeighbouringPoints();
    List<Point> validPoints = new ArrayList<Point>();
    for (Point neighbour : allNeighbours) {
      if(this.isValidPoint(neighbour)) validPoints.add(neighbour);
    }
    return validPoints;
  }

  public List<Pixel> getNeighbouringPixelsOfSameColor(Pixel pixel) {
    List<Pixel> validPixels = new ArrayList<Pixel>();
    for (Point point : getValidNeighbouringPoints(pixel.getPoint())) {
      Pixel correspondingPixel = this.getPixel(point);
      if(correspondingPixel.getColor().equals(pixel.getColor()))
        validPixels.add(correspondingPixel);
    }
    return validPixels;
  }
}