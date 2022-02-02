public class Points {
    private Pupil pupil;
    private Subject subject;
    private String point;

    public Points(Pupil pupil, Subject subject, String point) {
        this.pupil = pupil;
        this.subject = subject;
        this.point = point;
    }

    public String getIdSub(){
        return subject.getId();
    }

    public String getPoint(){
        return point;
    }

    public String toString(){
        return pupil.toString() + " " + point;
    }

}
