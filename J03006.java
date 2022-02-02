import java.util.*;
public class J03006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char arr[] = {'1','3','5','7','9'};
        while(t-- > 0){
            String str = sc.next();
            if(even_number((str), arr)){
                String rev = new StringBuffer(str).reverse().toString();
                if(str.equals(rev))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
        sc.close();
    }

    static boolean even_number(String str,char[] arr){
        for(int i = 0; i < str.length(); i++){
            if(include(str.charAt(i), arr))
                return false;
        }
        return true;
    }
    static boolean include(char ch, char[] arr){
        for(char ele : arr)
            if(ele == ch)
                return true;
        return false;
    }
}
