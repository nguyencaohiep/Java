public class Test implements Comparable<Test>{
    private String id;
    private String date;
    private String time;
    private String code;

    public Test(String id, String date, String time, String code) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.code = code;
    }

    public String getDate_Time(){
        return date + " " + time;
    }

    public String getId() {
        return id;
    }

    public int compareTo(Test t){
        if(this.getDate_Time().equals(t.getDate_Time())) {
            return this.getId().compareTo(t.getId());
        }
        return this.getDate_Time().compareTo(t.getDate_Time());
    }

    public String toString(){
        return date + " " + time + " " + code;
    }
}

