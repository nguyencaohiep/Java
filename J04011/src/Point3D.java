public class Point3D {
    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        Point3D res = new Point3D((p1.y - p3.y) * (p2.z - p3.z) - (p2.y - p3.y) * (p1.z - p3.z),
                (p1.z - p3.z) * (p2.x - p3.x) - (p2.z - p3.z) * (p1.x - p3.x),
                (p1.x - p3.x) * (p2.y - p3.y) - (p1.y - p3.y) * (p2.x - p3.x));
        Point3D tmp = new Point3D(p4.x - p3.x, p4.y - p3.y, p4.z - p3.z);
        if (res.x * tmp.x + res.y * tmp.y + res.z * tmp.z == 0)
            return true;
        else
            return false;
    }
}
