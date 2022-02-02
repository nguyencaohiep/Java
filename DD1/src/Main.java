import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arrS = new ArrayList<>();
        HashMap<String, Student> hsStu = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            Student st = new Student(id, sc.nextLine(), sc.nextLine(), "", 10);
            arrS.add(st);
            hsStu.put(id, st);
        }
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().split("\\s+");
            String id = str[0];
            Student stu = hsStu.get(id);
            stu.setDiligence(str[1]);
        }
        for(Student st : arrS){
            System.out.println(st);
        }
        sc.close();
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
 */