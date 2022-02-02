public class Company {
    private String id;
    private String name;
    private int numberOfPupil;

    public Company(String id, String name, int numberOfPupil) {
        this.id = id;
        this.name = name.trim().replaceAll("\\s+", " ");
        this.numberOfPupil = numberOfPupil;
    }

    public int getNumberOfPupil() {
        return numberOfPupil;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + numberOfPupil;
    }
}
