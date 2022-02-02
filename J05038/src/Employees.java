public class Employees {
    private String id;
    private String name;
    private String role;
    private long payDay;
    private long salary;
    private long workDay;
    private long bonus;
    private long allowance;//phụ cấp
    private long income;

    public Employees(int id, String name, long payDay, long workDay, String role) {
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.payDay = payDay;
        this.workDay = workDay;
        this.salary = payDay * workDay;
        this.role = role;
        if (workDay < 22)
            this.bonus = 0;
        else if (workDay < 25)
            this.bonus = (long) (this.salary * 10 / 100.0);
        else
            this.bonus = (long) (this.salary * 20 / 100.0);
        if (role.equals("GD"))
            this.allowance = 250000;
        else if (role.equals("PGD"))
            this.allowance = 200000;
        else if (role.equals("TP"))
            this.allowance = 180000;
        else
            this.allowance = 150000;
        this.income = salary + bonus + allowance;
    }

    public long getIncome() {
        return income;
    }

    public String toString() {
        return id + " " + name + " " + salary + " " + bonus + " " + allowance + " " + income;
    }
}
