public class Employees {
    private String id;
    private String name;
    private long workDay;
    private String role;
    private long bonus;
    private long price;
    private long allowance;
    private long salary;
    private long income;

    public Employees(int id, String name, long price, long workDay, String role) {
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.price = price;
        this.workDay = workDay;
        this.salary = workDay * price;
        if (workDay < 22)
            this.allowance = 0;
        else if (workDay < 25)
            this.allowance = (long) (salary * 10 / 100.0);
        else
            this.allowance = (long) (salary * 20 / 100.0);
        this.role = role;
        if (role.equals("GD"))
            this.bonus = 250000;
        else if (role.equals("PGD"))
            this.bonus = 200000;
        else if (role.equals("TP"))
            this.bonus = 180000;
        else
            this.bonus = 150000;
        this.income = salary + bonus + allowance;
    }

    public long getIncome() {
        return income;
    }

    public String toString() {
        return id + " " + name + " " + salary + " " + allowance + " " + bonus + " " + income;
    }
}