public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double dis1 = p1.distance(p2);
        double dis2 = p2.distance(p3);
        double dis3 = p3.distance(p1);

        double dif1 = dis1 + dis2 - dis3;
        double dif2 = dis1 - dis2 + dis3;
        double dif3 = -dis1 + dis2 + dis3;
        double area = Math.sqrt((dis1 + dis2 + dis3) * dif1 * dif2 * dif3) / 4;
        return area;
    }
}
