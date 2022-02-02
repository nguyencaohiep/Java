import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ComplexNumbers c1 = new ComplexNumbers(sc.nextInt(), sc.nextInt());
            ComplexNumbers c2 = new ComplexNumbers(sc.nextInt(), sc.nextInt());
            ComplexNumbers tmp = c1.add(c2);
            System.out.println(tmp.multi(c1) + ", " + tmp.multi(tmp));
        }
        sc.close();
    }
}
/*
3
1 2 3 4
2 3 4 5
1 -2 5 -6
 */