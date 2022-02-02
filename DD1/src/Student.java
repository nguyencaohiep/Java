public class Student {
    private String id;
    private String name;
    private String cla;
    private String diligence;
    private int point;

    public Student(String id, String name, String cla, String diligence, int point) {
        this.id = id;
        this.name = name;
        this.cla = cla;
        this.diligence = diligence;
        this.point = point;
    }

    public void setPoint(String diligence) {
        for(int i = 0; i < diligence.length(); i++){
            char c = diligence.charAt(i);
            if(c == 'v'){
                this.point -= 2;
            }
            else if(c == 'm'){
                this.point -= 1;
            }
        }
    }

    public void setDiligence(String str){
        this.diligence = str;
    }

    public String toString(){
        setPoint(this.diligence);
        if(point <= 0)
            return id + " " + name + " " + cla + " " + 0 + " KDDK";
        else
            return id + " " + name + " " + cla + " " + point;
    }
}
