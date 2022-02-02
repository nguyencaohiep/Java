public class Subject {
    private int number;
    private String id;
    private String name;

    public Subject(String id, String name, int number) {
        this.number = number;
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return id + " " +  name + " " + number;
    }
}
