public class Triangle {
    private Point p1 = new Point();
    private Point p2 = new Point();
    private Point p3 = new Point();
    private double dis1;
    private double dis2;
    private double dis3;

    public Triangle(String str1, String str2, String str3) {
        String[] s1 = str1.split("\\s+");
        this.p1.setX(s1[0]);
        this.p1.setY(s1[1]);
        String[] s2 = str2.split("\\s+");
        this.p2.setX(s2[0]);
        this.p2.setY(s2[1]);
        String[] s3 = str3.split("\\s+");
        this.p3.setX(s3[0]);
        this.p3.setY(s3[1]);
        setDistance();
    }

    public void setDistance(){
        this.dis1 = p1.distance(p2);
        this.dis2 = p3.distance(p2);
        this.dis3 = p1.distance(p3);
    }
    public boolean valid(){
        if((dis1 + dis2 <= dis3) || (dis1 + dis3 <= dis2) || (dis2 + dis3 <= dis1))
            return false;
        return true;
    }

    public String getPerimeter(){
        return String.format("%.3f",dis1 + dis2 + dis3);
    }
}
