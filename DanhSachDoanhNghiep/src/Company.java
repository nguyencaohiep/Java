public class Company implements Comparable<Company> {
    private String id;
    private String name;
    private int number;

    public Company(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int compareTo(Company o){
        return this.id.compareTo(o.id);
    }

    public String toString(){
        return id + " " + name + " " + number;
    }
}
