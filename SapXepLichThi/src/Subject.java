public class Subject {
    private String id;
    private String name;
    private String type;

    public Subject(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String toString(){
        return name;
    }
}
