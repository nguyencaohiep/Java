import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean have = false;
        int n = Integer.parseInt(sc.nextLine());
        int[] tmp = new int[201];
        int e = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.equals("")) {
                break;
            }
            String[] t = line.split(" ");
            for(String s : t){
                 e = Integer.parseInt(s);
                tmp[e] = 1;
            }
        }
        for (int i = 1; i <= e  ; i++) {
            if(tmp[i] == 0){
                have = true;
                System.out.println(i);
            }
        }
        if(!have){
            System.out.println("Excellent!");
        }


    }
}
