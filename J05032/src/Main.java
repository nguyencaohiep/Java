import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            Date datOfBirth = new SimpleDateFormat("dd/MM/yyy").parse(input[1]);
            Person person = new Person(input[0], datOfBirth);
            arr.add(person);
        }
        arr.sort(((o1, o2) -> o1.getDateOfBirth().compareTo(o2.getDateOfBirth())));
        System.out.println(arr.get(arr.size() - 1));
        System.out.println(arr.get(0));
        sc.close();
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
 */
