public class Employees {
    private String id;
    private String name;
    private String role;
    private int basicSalary;
    private int allowance;
    private int workdays;

    public Employees(int id, String name, String role, int basicSalary, int workdays) {
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.role = role;
        this.basicSalary = basicSalary;
        if (role.equals("GD"))
            this.allowance = 500;
        else if (role.equals("PGD"))
            this.allowance = 400;
        else if (role.equals("TP"))
            this.allowance = 300;
        else if (role.equals("KT"))
            this.allowance = 250;
        else
            this.allowance = 100;
        this.workdays = workdays;
    }

    public String getRole() {
        return role;
    }

    public String toString() {
        double i = (double) ((allowance + basicSalary * workdays) * 2 / 3);
        double t = 0;
        if (i < 25000) {
            t = (double) (i);
            t = Math.round(t / 1000) * 1000;
        } else
            t = 25000;
        return id + " " + name + " " + allowance + " " + basicSalary * workdays + " " + (int) (t) +
                " " + (basicSalary * workdays - (int) (t) + allowance);
    }
}
