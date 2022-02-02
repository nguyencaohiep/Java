public class Pupil {
    private String id;
    private String name;
    private String phoneNumber;
    private int groupNumber;

    public Pupil(String id, String name, String phoneNumber, int groupNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.groupNumber = groupNumber;
    }

    public String getId() {
        return id;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + groupNumber;
    }
}

