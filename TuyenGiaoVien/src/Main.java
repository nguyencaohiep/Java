import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> arrT = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = String.format("GV%02d", i + 1);
            arrT.add(new Teacher(id, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(arrT);
        for(Teacher t : arrT){
            System.out.println(t);
        }
        sc.close();
    }
}
/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
*/