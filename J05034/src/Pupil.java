public class Pupil {
    private int stt;
    private String id;
    private String name;
    private String cl;
    private String email;
    private String company;

    public Pupil(int stt, String id, String name, String cl, String email, String company) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.email = email;
        this.company = company;
    }

    public String getId(){
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String toString() {
        return String.format("%s ", stt) + id + " " + name + " " + cl + " " + email + " " + company;
    }
}
