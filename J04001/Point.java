package J04001;

public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return distance(p, this);
    }

    public double distance(Point p1, Point p2) {
        x = (p1.x - p2.x) * (p1.x - p2.x);
        y = (p1.y - p2.y) * (p1.y - p2.y);
        return  Math.sqrt(x + y);
    }
}
