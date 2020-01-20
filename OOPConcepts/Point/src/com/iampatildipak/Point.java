package com.iampatildipak;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

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

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

        int pointX1 = (x - this.x);

        int pointY1 = (y - this.y);

        return Math.sqrt((pointX1 * pointX1) + (pointY1 * pointY1));
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
}