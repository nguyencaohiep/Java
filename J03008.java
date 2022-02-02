import java.util.*;

public class J03008 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        char arr[] = {'2','3','5','7'};
        while(t-- > 0){
            String str = sc.next();
            String rev = new StringBuffer(str).reverse().toString();
            if(prime(str,arr))
                if(str.equals(rev))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            else 
                System.out.println("NO");
        }
        sc.close();
    } 
    static boolean prime(String str,char[] arr){
        for(int i = 0; i < str.length(); i++){
            if(include(str.charAt(i), arr) == false)
                return false;
        }
        return true;
    }
    static boolean include(char ch,char[] arr){
        for(char ele : arr)
            if(ele == ch)
                return true;
        return false;
    }
}
