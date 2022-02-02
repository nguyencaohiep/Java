public class Teacher {
    private String id;
    private String name;
    private float realTime;
    
    public Teacher(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public void setRealTime(float realTime){
        this.realTime = realTime;
    }
@Override
    public String toString(){
        String resTime = String.format("%.2f",realTime);
        return name + " " + resTime ;
    }

}
