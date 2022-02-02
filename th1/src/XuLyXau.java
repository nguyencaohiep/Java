import java.util.Arrays;
import java.util.Scanner;
public class XuLyXau {
    private String xau;

    public XuLyXau() {
    }
    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap vao xau:");
        xau=in.nextLine().trim();
    }
    public void email(){
        //trinh thi van anh - anhttv@ptit.edu.vn
        String[] x=xau.toLowerCase().split("\\s+");
        String email=x[x.length-1];
        for (int i = 0; i < x.length-1; i++) {
            email+=x[i].charAt(0);
        }
        System.out.println(email+"@ptit.edu.vn");
    }
    public void layChu(){
        String[] chu=xau.split("[\\d\\s]+");
        System.out.println(Arrays.toString(chu));
    }
}
