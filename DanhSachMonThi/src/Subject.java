public class Subject implements Comparable<Subject>{
    private String id;
    private String name;
    private String type;

    public Subject(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public int compareTo(Subject o){
        return this.getId().compareTo(o.getId());
    }

    public String toString(){
        return id + " " + name + " " + type;
    }
}
