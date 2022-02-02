public class RealTime {
    private Teacher teacher;
    private Subject sub;

    public RealTime(Teacher teacher,Subject subject,float time){
        this.teacher = teacher;
        this.sub = subject;
        this.teacher.setRealTime(time);
    }
}
