import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<Company> arr = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            Company com = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(com);
        }
        Collections.sort(arr);
        for(Company com : arr){
            System.out.println(com);
        }
        sc.close();

    }
}
