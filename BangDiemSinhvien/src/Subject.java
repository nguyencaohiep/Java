public class Subject {
    private String id;
    private String name;
    private int number;

    public Subject(String id, String name, int number) {
        this.id = id;
        String[] line = name.trim().toLowerCase().split("\\s+");
        String tmp = (line[0].charAt(0)+ "").toUpperCase() + line[0].substring(1) + " ";
        for (int i = 1; i < line.length; i++) {
            tmp+=line[i]+" ";
        }
        this.name = tmp.trim();
        this.number = number;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
