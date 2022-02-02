import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(sc.nextLine());
            System.out.println(resolve(m));
        }
        sc.close();
    }

    private static String resolve(int n){
        Queue<String> q = new LinkedList<String>();
        q.add("9");
        while(q.size() > 0){
            String tmp = q.peek();
            q.remove();
            long t = Long.parseLong(tmp);
            if(t % n == 0){
                return tmp;
            }
            q.add(tmp + "0");
            q.add(tmp + "9");
        }
        return "";
    }
}
