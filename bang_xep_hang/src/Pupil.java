public class Pupil {
    private String name;
    private Integer ac;
    private Integer submit;

    public Pupil(String name, String score) {
        this.name = name;
        String[] input = score.trim().split("\\s+");
        this.ac = Integer.parseInt(input[0]);
        this.submit = Integer.parseInt(input[1]);
    }

    public String getName() {
        return name;
    }

    public Integer getAc() {
        return ac;
    }

    public Integer getSubmit() {
        return submit;
    }

    public String toString() {
        return name + " " + ac + " " + submit;
    }
}
