import java.util.*;
public class J03025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str =  sc.next();
            int dif = 0;
            int len = str.length();
            String rev = new StringBuffer(str).reverse().toString();
            for(int j = 0; j < len; j++){
                if(str.charAt(j) != rev.charAt(j))
                    dif++;
            }
            if((dif > 2) || ((dif == 0) && (len % 2 == 0)))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
         sc.close();
    }
}
