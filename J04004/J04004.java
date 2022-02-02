package J04004;
import java.util.*;
public class J04004 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        PhanSo p1 = new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo p2 = new PhanSo(sc.nextLong(),sc.nextLong());
        p1 = p1.add(p2);
        p1.rutGon();
        System.out.println(p1);
        sc.close();
    }
}
