import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Collections;
import java.util.Scanner;
public class WordSet {
    private ArrayList<String> arr = new ArrayList<>();

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        HashSet<String> words = new HashSet<>();
        while(sc.hasNextLine()) {
            String[] line = sc.nextLine().trim().toLowerCase().split("\\s+");
            for (String str : line) {
                if (!words.contains(str)) {
                    words.add(str);
                }
            }
            this.arr = new ArrayList<>(words);
            Collections.sort(this.arr);
        }
    }

    public ArrayList getArr(){
        return this.arr;
    }

    public String union(WordSet w2){
        HashSet<String> unionSet = new HashSet<>();
        unionSet.addAll(this.arr);
        for(String tmp : w2.arr){
            if(!unionSet.contains(tmp)){
                unionSet.add(tmp);
            }
        }
        ArrayList<String> unionArr = new ArrayList<>(unionSet);
        Collections.sort(unionArr);
        String res = "";
        for(String str : unionArr){
            res += str + " ";
        }
        return res;
    }

    public String intersection(WordSet w2){
        HashSet<String> intersectionSet = new HashSet<>();
        HashSet<String> hs1 = new HashSet<>();
        hs1.addAll(this.arr);
        HashSet<String> hs2 = new HashSet<>();
        hs2.addAll(w2.arr);
        for(String str : hs1){
            if(hs2.contains(str)){
                intersectionSet.add(str);
            }
        }
        ArrayList<String> intersectionArr = new ArrayList<>(intersectionSet);
        Collections.sort(intersectionArr);
        String res = "";
        for(String str : intersectionArr){
            res += str + " ";
        }
        return res;
    }
}
