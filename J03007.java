import java.util.*;
public class J03007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            String rev = new StringBuffer(str).reverse().toString();
            if(str.equals(rev) & divide_10(str))
                if(str.charAt(0) == '8')    
                    System.out.println("YES");
                else
                    System.out.println("NO");
            else
                System.out.println("NO");
        }
        sc.close();
    }

    static boolean divide_10(String str){
        int sum = 0;
        for(int i= 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        if(sum % 10 == 0)
            return true;
        else 
            return false;
    }
    
}
