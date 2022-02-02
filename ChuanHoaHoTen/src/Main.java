import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String line = sc.nextLine().trim();
            if(line.equals("END"))
                break;
            String[] lines = line.toLowerCase().split("\\s+");
            String res = "";
            for(String str : lines){
                res += (str.charAt(0) + "").toUpperCase() + str.substring(1) + " ";
            }
            System.out.println(res.trim());
        }
        sc.close();

    }
}

