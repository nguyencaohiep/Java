public class TestSchedule implements Comparable<TestSchedule> {
    private Test test;
    private Subject sub;
    private String codeGr;
    private int number;

    public TestSchedule(Test test, Subject sub, String codeGr, int number) {
        this.test = test;
        this.sub = sub;
        this.codeGr = codeGr;
        this.number = number;
    }

    public Test getTest() {
        return test;
    }

    public int compareTo(TestSchedule o){
        if(this.getTest().getDate_Time().equals(o.getTest().getDate_Time())){
            return this.getTest().getId().compareTo(o.getTest().getId());
        }
        return this.getTest().getDate_Time().compareTo(o.getTest().getDate_Time());
    }

    public String toString(){
        return test + " " + sub + " " + codeGr + " " + number;
    }
}
