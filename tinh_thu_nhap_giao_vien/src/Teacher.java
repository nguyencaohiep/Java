public class Teacher {
    private String id;
    private String name;
    private String role;
    private long bonus;
    private int coe; // coefficient : hệ số
    private long basicSalary;


    public Teacher(String id, String name, long basicSalary) {
        this.id = id;
        this.role = id.substring(0, 2);
        this.coe = Integer.parseInt(id.substring(2));
        if (role.equals("HT"))
            this.bonus = 2000000;
        else if (role.equals("HP"))
            this.bonus = 900000;
        else
            this.bonus = 500000;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String toString() {
        return id + " " + name + " " + coe + " " + bonus + " " + (basicSalary * coe + bonus);
    }

}
