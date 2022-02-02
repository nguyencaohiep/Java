import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String[] input = sc.nextLine().replaceAll("\\s"," ").split(" ");
            for (String s : input) {
                StringBuilder res = new StringBuilder(s);
                System.out.print(res.reverse().toString() + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
