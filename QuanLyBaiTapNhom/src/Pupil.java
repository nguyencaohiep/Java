public class Pupil {
    private String id;
    private String name;
    private String phoneNumber;
    private int groupNumber;
    private String exercise;


    public String getId() {
        return id;
    }

    public Pupil(String id, String name, String phoneNumber,int groupNumber,String exercise) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.groupNumber = groupNumber;
        this.exercise = exercise;
    }

    public String toString(){
        return id + " " + name + " " + phoneNumber + " " + groupNumber + " " + exercise;
    }
}
