package com.mycompany._2d_geometry_primitives;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        this.points.add(newPoint);
    }

    public void appendPoint(Point p) {
        this.points.add(p);
    }

    public double getLength() {
        double totalLength = 0.0;
        if (points.size() < 2) {
            return 0.0;
        }
        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            totalLength += currentPoint.distanceFromPoint(nextPoint);
        }
        return totalLength;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i).toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
