public class Pupil {
    private String id;
    private String fullName;
    private String cl;
    private String email;

    public Pupil(String id, String fullName, String cl, String email) {
        this.id = id;
        this.fullName = fullName;
        this.cl = cl;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return String.format("%s %s %s %s", id, fullName, cl, email);
    }
}
