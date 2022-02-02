import java.util.Date;

public class Pupil {
    private String id;
    private String name;
    private String cl;
    private String dateOfBirth;
    private float gpa;

    public Pupil(int id, String name, String cl, String dateOfBirth, float gpa) {
        this.id = String.format("B20DCCN0%02d", id);
        this.name = name;
        this.cl = cl;
        String[] tmp = dateOfBirth.split("/");
        if(tmp[0].length()!=2){
            tmp[0] = "0"+tmp[0];
        }
        if(tmp[1].length()!=2){
            tmp[1] = "0"+tmp[1];
        }
        this.dateOfBirth = tmp[0]+"/"+tmp[1]+"/"+tmp[2];
        this.gpa = gpa;
    }

    public String toString() {
        return id + " " + name + " " + cl + " " + dateOfBirth + " " + String.format("%.2f",gpa);
    }
}
