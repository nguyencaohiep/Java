import java.util.*;
public class J01001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m <= 0 || n <= 0)
            System.out.println(0);
        else {
            System.out.print((m + n) * 2);
            System.out.print(" ");
            System.out.print(m * n);
            sc.close();
        }
    }
    
}
