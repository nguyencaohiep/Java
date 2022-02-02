import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> arrP = (ArrayList<Pair>)(inputStream.readObject());
        Collections.sort(arrP);

        HashSet<Pair> hsP = new HashSet<>();
        for(Pair p : arrP){
            if(!hsP.contains(p) && (p.getFirst() < p.getSecond())){
                System.out.println(p);
                hsP.add(p);
            }
        }
    }
}
