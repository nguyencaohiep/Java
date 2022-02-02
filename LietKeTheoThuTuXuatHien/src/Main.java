import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr1 = (ArrayList<String>) (inputStream.readObject());
        ArrayList<String> arr2 = new ArrayList<>();
        for(String str : arr1){
            String[] line = str.trim().toLowerCase().split("\\s+");
            for(String w : line){
                arr2.add(w);
            }
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> arr3 = new ArrayList<>();
        while (sc.hasNextLine()){
            String tmp = sc.nextLine();
            if(tmp.equals("")){
                continue;
            }
            String[] line = tmp.trim().toLowerCase().split("\\s+");
            for(String w : line){
                if(!arr3.contains(w)){
                    if(arr2.contains(w)){
                        System.out.println(w);
                    }
                }
                arr3.add(w);
            }
        }
        sc.close();
    }
}
