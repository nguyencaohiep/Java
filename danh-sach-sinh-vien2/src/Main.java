import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream inputFile = new FileInputStream(new File("DATA.IN"));
        DataInputStream input = new DataInputStream(inputFile);
        int n = input.readInt();
        for (int i = 0; i < n; i++) {

        }
/*



        Scanner scanner = new Scanner(new File("SV.in"));
        int n =Integer.parseInt(scanner.nextLine());
        List<Pupil> arr = new ArrayList();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String cl = scanner.nextLine();
            String date = scanner.nextLine();
            float gpa = Float.parseFloat(scanner.nextLine());
            Pupil pupil = new Pupil(i+1,name,cl,date,gpa);
            arr.add(pupil);
        }
        for(Pupil pupil : arr){
            System.out.println(pupil);
        }
        scanner.close();
    }
}
 */

    }
}
