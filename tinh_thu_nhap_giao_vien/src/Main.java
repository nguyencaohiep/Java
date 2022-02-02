import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        System.out.println(teacher);
    }
}
/*
HP04
Tran Quoc Huy
1578000
 */
