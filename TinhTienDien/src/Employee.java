public class Employee {
    private String id;
    private String name;
    private int basicSalary;
    private int days;
    private int hs;

    public Employee(String id, String name, int basicSalary, int days) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.days = days;
        String gr = id.charAt(0)+"";
        int years = Integer.parseInt(id.substring(1,3));
        int tmp = 0;
        if(gr.equals("A")){
            if(years <= 3){
                tmp = 10;
            }
            else if (years <= 8){
                tmp = 12;
            }
            else if (years <= 15){
                tmp = 14;
            }
            else {
                tmp = 20;
            }
        }
        else if(gr.equals("B")){
            if(years <= 3){
                tmp = 10;
            }
            else if (years <= 8){
                tmp = 11;
            }
            else if (years <= 15){
                tmp = 13;
            }
            else {
                tmp = 16;
            }
        }
        else if(gr.equals("C")){
            if(years <= 3){
                tmp = 9;
            }
            else if (years <= 8){
                tmp = 10;
            }
            else if (years <= 15){
                tmp = 12;
            }
            else {
                tmp = 14;
            }
        }
        else {
            if(years <= 3){
                tmp = 8;
            }
            else if (years <= 8){
                tmp = 9;
            }
            else if (years <= 15){
                tmp = 11;
            }
            else {
                tmp = 13;
            }
        }
        this.hs = tmp;
    }

    public String toString(){
        return id + " " + name + " " + basicSalary*days*hs*1000;
    }


}
