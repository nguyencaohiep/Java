public class Pupil {
    private String id;
    private String name;
    private String cl;
    private String email;

    public Pupil(String id, String name, String cl, String email) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.email = email;
    }

    public String getYear() {
        return "20" + cl.substring(1, 3);
    }

    public String toString() {
        return id + " " + name + " " + cl + " " + email + " ";
    }
}

