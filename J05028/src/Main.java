import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Company> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Company company = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(company);
        }
        arr.sort(((o1, o2) -> {
            int num1 = o1.getNumberOfPupil();
            int num2 = o2.getNumberOfPupil();
            if (num1 > num2)
                return -1;
            else if (num1 < num2)
                return 1;
            else
                return o1.getId().compareTo(o2.getId());
        }));
        for(Company company : arr){
            System.out.println(company);
        }
        sc.close();
    }
}
/*
4
VIETTEL
TaP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
 */