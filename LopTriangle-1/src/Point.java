import java.util.Scanner;
public class Point {
    private double x;
    private double y;

    public Point(){
        this.x = 1;
        this.y = 1;
    }

    public void setX(String x) {
        this.x = Double.parseDouble(x);
    }

    public void setY(String y) {
        this.y = Double.parseDouble(y);
    }

    public static String nextPoint(Scanner sc) {
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        return a + " " + b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point o){
        double diffX = o.getX() - this.getX();
        double diffY = o.getY() - this.getY();
        return Math.sqrt(diffX * diffX + diffY * diffY) ;
    }

    public String toString(){
        return x + " " + y;
    }
}
