
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(new File("VANBAN.in"));
       String line = "";
       ArrayList<String> res = new ArrayList<>();
       while(input.hasNextLine()){
            line+= input.nextLine() +" ";
       }
       line = line.toUpperCase().trim();
       HashSet<String> hs = new HashSet<>();
       String[] tmp = line.split("\\s+");
       for(String i : tmp){
           if(!hs.contains(i)){
               hs.add(i);
               res.add(i);
           }
       }
       Collections.sort(res);
       for(String i : res){
           System.out.println(i);
       }
       input.close();

    }
}
