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

    public String getMajor() {
        return id.substring(5,7).toUpperCase();
    }

    public char getCl(){
        return cl.charAt(0);
    }

    public String toString() {
        return id + " " + name + " " + cl + " " + email;
    }
}


