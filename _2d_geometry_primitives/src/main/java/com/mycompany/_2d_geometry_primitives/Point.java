package com.mycompany._2d_geometry_primitives;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceFromPoint(Point p) {
        int xDiff = this.x - p.getX();
        int yDiff = this.y - p.getY();
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public String toString() {
        return "(x=" + x + ", y=" + y + ")";
    }
}
