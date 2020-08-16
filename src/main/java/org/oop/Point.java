package org.oop;

public class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double differenceX(Point point) {
        double xDistance = point.x - this.x;
        return xDistance;
    }

    private double differenceY(Point point) {
        double yDistance = point.y - this.y;
        return yDistance;
    }
    public double distance(Point point) {
        return Math.sqrt(Math.pow(differenceX(point), 2) + Math.pow(differenceY(point), 2));
    }

    public double direction(Point point) {
        return Math.atan2(differenceY(point), differenceX(point));
    }
}
