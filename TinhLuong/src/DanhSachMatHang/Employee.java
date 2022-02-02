package DanhSachMatHang;

public class Employee {
    private String id;
    private String name;
    private int factor; // hệ số
    private int basicSalary;
    private int days;

    public Employee(String id, String name, int basicSalary, int days) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.days = days;
        setFactor();
    }

    public void setFactor() {
        String type = this.id.charAt(0) + "";
        int year = Integer.parseInt(this.id.substring(1,3));
        if(type.equals("A")){
            if(1 <= year && year<= 3){
                this.factor = 10;
            }
            else if(4 <= year && year <= 8){
                this.factor = 12;
            }
            else if(9 <= year && year <= 15){
                this.factor = 14;
            }else {
                this.factor = 20;
            }
        }
        else if(type.equals("B")){
            if(1 <= year && year<= 3){
                this.factor = 10;
            }
            else if(4 <= year && year<= 8){
                this.factor = 11;
            }
            else if(9 <= year && year<= 15){
                this.factor = 13;
            }else {
                this.factor = 16;
            }
        }
        else if(type.equals("C")){
            if(1 <= year && year<= 3){
                this.factor = 9;
            }
            else if(4 <= year && year<= 8){
                this.factor = 10;
            }
            else if(9 <= year && year<= 15){
                this.factor = 12;
            }else {
                this.factor = 14;
            }
        }
        else {
            if(1 <= year && year<= 3){
                this.factor = 8;
            }
            else if(4 <= year && year<= 8){
                this.factor = 9;
            }
            else if(9 <= year && year<= 15){
                this.factor = 11;
            }else {
                this.factor = 13;
            }
        }
    }

    public long getSalary(){
        return factor * basicSalary * days * 1000;
    }

    public String toString(){
        return id + " " + name;
    }
}
